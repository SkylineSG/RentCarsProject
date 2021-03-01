package service;

import cars.Car;
import cars.Comfort.Mercedes_sls_WW70394;
import user.User;

public class MercedesRentalService implements RentalService {

    @Override
    public boolean rent(User user, Mercedes_sls_WW70394 mercedes_sls_ww70394) {
        return true;
    }

//    @Override
//    public boolean rent(User user, Car car) {
//        return false;
//    }
}
