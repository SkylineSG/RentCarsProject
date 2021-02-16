package exceptions;

public class CarIsNotAvailable extends Exception {

    public void notAvailable() {
        System.out.println("Wynajęty samochód");
    }
}
