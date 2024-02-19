package roomresrvationlcl.domain;

import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

@Data
@ToString
public class ReservationComplete extends AbstractEvent {

    private Long rsvId;
    private Long accId;
    private String status;
    private Date rsvDate;
}
