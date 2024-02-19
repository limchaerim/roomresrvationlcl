package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationComplete extends AbstractEvent {

    private Long rsvId;
    private Long accId;
    private String status;
    private Date rsvDate;

    public ReservationComplete(ReservationManagement aggregate) {
        super(aggregate);
    }

    public ReservationComplete() {
        super();
    }
}
//>>> DDD / Domain Event
