package cars.suv;


public class Bmw_x5_WW90678 implements Suv {


    private final String model = "Bmw X5";
    private final String type = "suv";
    private final String registration = "WW90678";
    private int vin = 123564577;
    private boolean isRented = false;


    public void rent() {
         isRented = true;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getRegistration() {
        return registration;
    }

    @Override
    public int getVin() {
        return vin;
    }

    @Override
    public void getIsRented() {
        if (isRented == false) {
                   System.out.println("Samochód do wynajecia");
        }else if (isRented == true) {
            System.out.println("Nie możesz go wynająć");
        }
    }


    @Override
    public double getfuelStatus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bmw_x5_WW90678{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", registration='" + registration + '\'' +
                ", vin=" + vin +
                ", isRented=" + isRented +
                '}';
    }


}
