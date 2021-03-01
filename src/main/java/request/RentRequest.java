package request;

import cars.Comfort.Mercedes_sls_WW70394;
import cars.repository.RentalRepository;
import user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RentRequest {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;
    private RentalRepository rentalRepository;
    private Mercedes_sls_WW70394 mercedes_sls_ww70394;

    public RentRequest(User user, LocalDateTime from, LocalDateTime to,Mercedes_sls_WW70394 mercedes_sls_ww70394) {
        this.user = user;
        this.from = from;
        this.to = to;
        this.mercedes_sls_ww70394 = mercedes_sls_ww70394;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public Mercedes_sls_WW70394 getmercedes_sls_ww70394() {
        return mercedes_sls_ww70394;
    }

    @Override
    public String toString() {
        return "RentRequest{" +
                "user=" + user +
                ", from=" + from +
                ", to=" + to +
                ", rentalRepository=" + rentalRepository +
                ", mercedes_sls_ww70394=" + mercedes_sls_ww70394 +
                '}';
    }
}
