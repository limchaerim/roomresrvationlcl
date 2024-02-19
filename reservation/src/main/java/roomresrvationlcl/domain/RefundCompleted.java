package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RefundCompleted extends AbstractEvent {

    private Long rsvId;
    private Long accId;
    private String status;
    private Date rsvDate;

    public RefundCompleted(ReservationManagement aggregate) {
        super(aggregate);
    }

    public RefundCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
