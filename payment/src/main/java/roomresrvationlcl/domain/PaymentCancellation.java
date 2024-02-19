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

    private Long paymentId;
    private Long accId;
    private Long rsvId;
    private Double amount;
    private Date paymentDt;
    private String status;

    public PaymentCancellation(Payment aggregate) {
        super(aggregate);
    }

    public PaymentCancellation() {
        super();
    }
}
//>>> DDD / Domain Event
