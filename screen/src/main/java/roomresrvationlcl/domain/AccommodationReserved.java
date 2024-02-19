package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import roomresrvationlcl.domain.*;
import roomresrvationlcl.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AccommodationReserved extends AbstractEvent {

    private Long accId;
    private String facility;
    private String name;
    private Date strDate;
    private Date endDate;
    private String personnel;
    private String uesrId;
    private String status;

    public AccommodationReserved(Accommodation aggregate) {
        super(aggregate);
    }

    public AccommodationReserved() {
        super();
    }
}
//>>> DDD / Domain Event
