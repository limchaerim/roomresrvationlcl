package roomresrvationlcl.external;

import java.util.Date;
import lombok.Data;

@Data
public class ReservationManagement {

    private Long rsvId;
    private Long accId;
    private String status;
    private Date rsvDate;
}
