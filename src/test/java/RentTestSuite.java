import Price.PriceComfort;
import cars.Comfort.Mercedes_sls_WW70394;
import cars.repository.CarRentalRepository;
import cars.repository.MercedesRentalRepository;
import cars.suv.Bmw_x5_WW90678;
import cars.Car;
import cars.CarFleet;
import org.junit.Assert;
import org.junit.BeforeClass;
import request.RentRequest;
import request.RentRequestRetriver;
import service.CarRentalService;
import service.MailService;
import service.MercedesRentalService;
import user.NormalUser;
import user.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

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

       // Rent firstRent = new Rent(pawel,car1);
       // firstRent.rent();
        car1.getIsRented();        
    }
    @Test
    public void RentMercedes_sls_WW70394Test() {
        PriceComfort price;
        User krzysztof = new NormalUser("Krzysztof","Kononowicz",86756487);

    //    Car mercedes = new Mercedes_sls_WW70394();
   //     mercedes.getIsRented();

//        RentRequestRetriver rentRequestRetriver = new RentRequestRetriver();
//        RentRequest rentRequest= rentRequestRetriver.retrive();
//
//       RentalProcessor rentalProcessor = new RentalProcessor(
//               new MailService(),new CarRentalService(), new CarRentalRepository());
//               rentalProcessor.process(rentRequest);
   //    )
        }














      //  Rent firstRent = new Rent(krzysztof,mercedes);
      //  firstRent.rent();
//        mercedes.getIsRented();
//        mercedes.getIsRented();
//
//      //  Rent secondRent = new Rent(piotr,mercedes);
//      //  secondRent.rent();
//        mercedes.getIsRented();


       // System.out.println(firstRent.getCar());
       // System.out.println(secondRent.getCar());
       // Assert.assertEquals(mercedes,firstRent.getCar());
       // Assert.assertEquals(mercedes,secondRent.getCar());


            @Test
          public  void TEST2345() {
                RentRequestRetriver rentRequestRetriver = new RentRequestRetriver();

                RentRequest rentRequest1 = rentRequestRetriver.retrive1();

                RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),new MercedesRentalService(),new MercedesRentalRepository());
                rentalProcessor.process(rentRequest1);

                rentRequest1.getUser();
                rentRequest1.getFrom();
                rentRequest1.getTo();
                rentRequest1.getmercedes_sls_ww70394();
                System.out.println(rentRequest1.getUser());
                System.out.println(rentRequest1.getFrom());
                System.out.println(rentRequest1.getTo());
                System.out.println(rentRequest1.getmercedes_sls_ww70394());








            }








    }
