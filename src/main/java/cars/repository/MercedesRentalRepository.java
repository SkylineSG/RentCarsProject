package cars.repository;

import request.RentRequest;
import service.RentalService;
import user.User;

public class MercedesRentalRepository implements RentalRepository {

    @Override
    public boolean createRental(RentRequest rentRequest) {
        return true;
    }
}
