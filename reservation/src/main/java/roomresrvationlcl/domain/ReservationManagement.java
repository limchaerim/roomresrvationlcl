package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import roomresrvationlcl.ReservationApplication;
import roomresrvationlcl.domain.PaymentCancellation;
import roomresrvationlcl.domain.PaymentRequest;
import roomresrvationlcl.domain.RefundCompleted;
import roomresrvationlcl.domain.ReservationComplete;

@Entity
@Table(name = "ReservationManagement_table")
@Data
//<<< DDD / Aggregate Root
public class ReservationManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rsvId;

    private Long accId;

    private String status;

    private Date rsvDate;

    @PostPersist
    public void onPostPersist() {
        PaymentRequest paymentRequest = new PaymentRequest(this);
        paymentRequest.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        PaymentCancellation paymentCancellation = new PaymentCancellation(this);
        paymentCancellation.publishAfterCommit();

        ReservationComplete reservationComplete = new ReservationComplete(this);
        reservationComplete.publishAfterCommit();

        RefundCompleted refundCompleted = new RefundCompleted(this);
        refundCompleted.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static ReservationManagementRepository repository() {
        ReservationManagementRepository reservationManagementRepository = ReservationApplication.applicationContext.getBean(
            ReservationManagementRepository.class
        );
        return reservationManagementRepository;
    }
}
//>>> DDD / Aggregate Root
