package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentCancellation extends AbstractEvent {

    private Long rsvId;
    private Long accId;
    private String status;
    private Date rsvDate;

    public PaymentCancellation(ReservationManagement aggregate) {
        super(aggregate);
    }

    public PaymentCancellation() {
        super();
    }
}
//>>> DDD / Domain Event
