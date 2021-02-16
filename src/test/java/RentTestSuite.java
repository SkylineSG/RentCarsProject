import Price.PriceComfort;
import cars.Comfort.Mercedes_sls_WW70394;
import cars.suv.Bmw_x5_WW90678;
import cars.Car;
import cars.CarFleet;
import org.junit.Assert;
import org.junit.BeforeClass;
import user.NormalUser;
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
    public void RentBmw_x5_WW90678Test() {
        User pawel = new NormalUser("Pawel","Nowak",123141535);

        Car car1 = new Bmw_x5_WW90678();
        car1.getIsRented();

        Rent firstRent = new Rent(pawel,car1);
        firstRent.rent();
        car1.getIsRented();        
    }
    @Test
    public void RentMercedes_sls_WW70394Test() {
        PriceComfort price;
        User krzysztof = new NormalUser("Krzysztof","Kononowicz",86756487);
        User piotr = new NormalUser("Krzysztof","Kononowicz",864576487);

        Car mercedes = new Mercedes_sls_WW70394();
        mercedes.getIsRented();

        Rent firstRent = new Rent(krzysztof,mercedes);
        firstRent.rent();
        mercedes.getIsRented();
        mercedes.getIsRented();

        Rent secondRent = new Rent(piotr,mercedes);
        secondRent.rent();
        mercedes.getIsRented();


        System.out.println(firstRent.getCar());
        System.out.println(secondRent.getCar());
        Assert.assertEquals(mercedes,firstRent.getCar());
        Assert.assertEquals(mercedes,secondRent.getCar());
    }
}