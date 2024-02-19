package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import roomresrvationlcl.PaymentApplication;
import roomresrvationlcl.domain.Payment;
import roomresrvationlcl.domain.PaymentCancellation;

@Entity
@Table(name = "Payment_table")
@Data
//<<< DDD / Aggregate Root
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    private Long accId;

    private Long rsvId;

    private Double amount;

    private Date paymentDt;

    private String status;

    @PostPersist
    public void onPostPersist() {}

    @PostUpdate
    public void onPostUpdate() {
        PaymentCancellation paymentCancellation = new PaymentCancellation(this);
        paymentCancellation.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {
        Payment payment = new Payment(this);
        payment.publishAfterCommit();
    }

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
//>>> DDD / Aggregate Root
