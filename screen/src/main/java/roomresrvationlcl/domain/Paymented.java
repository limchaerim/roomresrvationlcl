package roomresrvationlcl.domain;

import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

@Data
@ToString
public class Paymented extends AbstractEvent {

    private Long paymentId;
    private Long accId;
    private Long rsvId;
    private Double amount;
    private Date paymentDt;
    private String status;
}
