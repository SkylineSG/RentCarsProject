package cars;

import Price.PriceComfort;

public interface Car {

   //  PriceComfort setPrice(PriceComfort price);
     String getModel();
     String getType();
     String getRegistration();
     int getVin();
     void getIsRented();
     double getfuelStatus();

    void rent();
}

