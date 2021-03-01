import cars.repository.CarRentalRepository;
import cars.repository.RentalRepository;
import dto.RentalDto;
import request.RentRequest;
import service.InformationService;
import service.RentalService;
import user.User;

import java.time.LocalDateTime;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
       // boolean isRented = rentalService.rent(rentRequest.getUser(),rentRequest.getFrom(),rentRequest.getTo());
        boolean isRented = rentalService.rent(rentRequest.getUser(),rentRequest.getmercedes_sls_ww70394());
        if (isRented) {
            informationService.inform(rentRequest.getUser());
           // rentalRepository.createRental(rentRequest.getUser(),rentRequest.getmercedes_sls_ww70394());
            //   rentalRepository.createRental(rentRequest.getUser(),rentRequest.getFrom(),rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(),true);
        }else {
             return new RentalDto(rentRequest.getUser(),false);
        }
    }
}
