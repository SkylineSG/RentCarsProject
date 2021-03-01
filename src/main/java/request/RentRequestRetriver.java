package request;

import cars.Comfort.Mercedes_sls_WW70394;
import cars.repository.MercedesRentalRepository;
import cars.repository.RentalRepository;
import user.NormalUser;
import user.User;

import java.time.LocalDateTime;

public class RentRequestRetriver {
    private LocalDateTime from;
    private LocalDateTime to;

    public RentRequest retrive1() {

        User user = new NormalUser("Pawel","Kowal",4233424);

        Mercedes_sls_WW70394 mercedes_sls_ww70394 = new Mercedes_sls_WW70394("mercedes","comfort","84864168WL",68484668,false);
        RentRequest rentRequest = new RentRequest(user,from,to,mercedes_sls_ww70394);
        return new RentRequest(user,rentRequest.getFrom(),rentRequest.getTo(),mercedes_sls_ww70394);
    }

}
