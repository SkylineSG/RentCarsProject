import cars.CarFleet;
import cars.repository.MercedesRentalRepository;
import request.RentRequest;
import request.RentRequestRetriver;
import service.InformationService;
import service.MailService;
import service.MercedesRentalService;
import service.RentalService;

public class Main {


    public static void main(String[] args) {

        RentRequestRetriver rentRequestRetriver = new RentRequestRetriver();

        RentRequest rentRequest1 = rentRequestRetriver.retrive1();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),new MercedesRentalService(),new MercedesRentalRepository());
        rentalProcessor.process(rentRequest1);

        rentRequest1.toString();



















//        Scanner uzytkownik1 = new Scanner(System.in);
//        System.out.println("Prosze podac imie");
//        String name = uzytkownik1.nextLine();
//        System.out.println("Prosze podac nazwisko");
//        String surname = uzytkownik1.nextLine();
//
//        Random id = new Random();
//
//        user user1 = new user(name,surname,id.nextInt());
//
//        System.out.println(user1.toString());

    }
}
