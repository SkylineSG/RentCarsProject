package cars.Comfort;

public class Mercedes_sls_WW70394 implements Comfort {

    private final String model = "Mercedes sls";
    private final String type = "Comfort";
    private final String registration = "WW70394";
    private int vin = 78473584;
    private boolean isRented = false;



    public void rent() {
        if (isRented == true) {
            System.out.println("Samochód już wynajęty!");
        }else
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
}
