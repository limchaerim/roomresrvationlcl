package roomresrvationlcl.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import roomresrvationlcl.config.kafka.KafkaProcessor;
import roomresrvationlcl.domain.*;

@Service
public class 예매조회ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 예매조회Repository 예매조회Repository;
    //>>> DDD / CQRS
}
