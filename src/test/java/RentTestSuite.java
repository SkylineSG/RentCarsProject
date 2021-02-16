import cars.suv.Bmw_x5_WW90678;
import cars.Car;
import cars.CarFleet;
import org.junit.BeforeClass;
import user.User;
import org.junit.Before;
import org.junit.Test;

public class RentTestSuite {
    static CarFleet fleet = new CarFleet();

    @BeforeClass
    public static void makeCarList(){
        fleet.makeCarsFleet();
    }

    @Test
    public void RentTest() {
        User pawel = new User("Pawel","Nowak",123141535);

        Car car1 = new Bmw_x5_WW90678();
        car1.getIsRented();

        Rent firstRent = new Rent(pawel,car1);
        firstRent.rent();
        car1.getIsRented();        
    }
}