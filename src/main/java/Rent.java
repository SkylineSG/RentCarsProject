import Price.PriceComfort;
import cars.Car;
import user.User;

import java.time.LocalDate;
import java.util.HashMap;

public class Rent {
    private User user;
    private Car car;
    private LocalDate localDate = LocalDate.now();
    private PriceComfort price;

    public Rent(User user, Car car) {
        this.user = user;
        this.car = car;
    }


    public void rent(){
        car.rent();
        getRentInfo();

    }

    public void getDayRent() {
        System.out.println("Samochód został wynajęty od: "
                + localDate.getDayOfMonth() + " "
                + localDate.getMonth() + " "
                + localDate.getYear());
    }
    public void getRentInfo() {
        getDayRent();
        user.toString();
    }

    public String getUser() {
        return user.getName();
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Rent{" +
                  user +
                ", car=" + car +
                '}';
    }

}
