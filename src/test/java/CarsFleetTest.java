import cars.CarFleet;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarsFleetTest {
    static CarFleet fleet = new CarFleet();

    @BeforeClass
    public static void makeCarList(){
        fleet.makeCarsFleet();
    }

    @Test
    public void showComfortCars(){
        fleet.getComfortLIst();
    }

    @Test
    public void showAllCars() {
        fleet.getFleet();
    }

}
