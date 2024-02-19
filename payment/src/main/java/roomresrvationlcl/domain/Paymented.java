package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Paymented extends AbstractEvent {

    private Long paymentId;
    private Long accId;
    private Long rsvId;
    private Double amount;
    private Date paymentDt;
    private String status;

    public Paymented(Payment aggregate) {
        super(aggregate);
    }

    public Paymented() {
        super();
    }
}
//>>> DDD / Domain Event
