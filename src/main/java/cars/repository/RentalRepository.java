package cars.repository;

import request.RentRequest;
import user.User;

public interface RentalRepository {
    boolean createRental(RentRequest rentRequest);

}
