package roomresrvationlcl.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "reservation", url = "${api.url.reservation}")
public interface ReservationManagementService {
    @RequestMapping(
        method = RequestMethod.POST,
        path = "/reservationManagements"
    )
    public void reservationAllocation(
        @RequestBody ReservationManagement reservationManagement
    );

    @RequestMapping(
        method = RequestMethod.PATCH,
        path = "/reservationManagements"
    )
    public void cancelReservation(
        @RequestBody ReservationManagement reservationManagement
    );

    @RequestMapping(
        method = RequestMethod.PATCH,
        path = "/reservationManagements"
    )
    public void paymentCompleted(
        @RequestBody ReservationManagement reservationManagement
    );

    @RequestMapping(
        method = RequestMethod.PATCH,
        path = "/reservationManagements"
    )
    public void refundProcessing(
        @RequestBody ReservationManagement reservationManagement
    );
}
