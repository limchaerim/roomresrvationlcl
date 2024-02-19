package roomresrvationlcl.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import roomresrvationlcl.config.kafka.KafkaProcessor;
import roomresrvationlcl.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AccommodationRepository accommodationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AccommodationReserved'"
    )
    public void wheneverAccommodationReserved_ReserveSaga(
        @Payload AccommodationReserved accommodationReserved
    ) {
        AccommodationReserved event = accommodationReserved;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + accommodationReserved + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AccommodationCanceled'"
    )
    public void wheneverAccommodationCanceled_ReserveSaga(
        @Payload AccommodationCanceled accommodationCanceled
    ) {
        AccommodationCanceled event = accommodationCanceled;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + accommodationCanceled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StatusChangeCompleted'"
    )
    public void wheneverStatusChangeCompleted_ReserveSaga(
        @Payload StatusChangeCompleted statusChangeCompleted
    ) {
        StatusChangeCompleted event = statusChangeCompleted;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + statusChangeCompleted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RefundCompleted'"
    )
    public void wheneverRefundCompleted_ReserveSaga(
        @Payload RefundCompleted refundCompleted
    ) {
        RefundCompleted event = refundCompleted;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + refundCompleted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationComplete'"
    )
    public void wheneverReservationComplete_ReserveSaga(
        @Payload ReservationComplete reservationComplete
    ) {
        ReservationComplete event = reservationComplete;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + reservationComplete + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentRequest'"
    )
    public void wheneverPaymentRequest_ReserveSaga(
        @Payload PaymentRequest paymentRequest
    ) {
        PaymentRequest event = paymentRequest;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + paymentRequest + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCancellation'"
    )
    public void wheneverPaymentCancellation_ReserveSaga(
        @Payload PaymentCancellation paymentCancellation
    ) {
        PaymentCancellation event = paymentCancellation;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + paymentCancellation + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Payment'"
    )
    public void wheneverPayment_ReserveSaga(@Payload Payment payment) {
        Payment event = payment;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + payment + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCancellation'"
    )
    public void wheneverPaymentCancellation_ReserveSaga(
        @Payload PaymentCancellation paymentCancellation
    ) {
        PaymentCancellation event = paymentCancellation;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + paymentCancellation + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
