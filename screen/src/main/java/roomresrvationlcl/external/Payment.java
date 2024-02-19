package roomresrvationlcl.external;

import java.util.Date;
import lombok.Data;

@Data
public class Payment {

    private Long paymentId;
    private Long accId;
    private Long rsvId;
    private Double amount;
    private Date paymentDt;
    private String status;
}
