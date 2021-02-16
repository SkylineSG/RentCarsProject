package cars;

public interface Car {


     String getModel();
     String getType();
     String getRegistration();
     int getVin();
     void getIsRented();
     double getfuelStatus();

    boolean rent();
}

