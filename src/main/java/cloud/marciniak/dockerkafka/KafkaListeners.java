package cloud.marciniak.dockerkafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id="listeners", topics = "order")
public class KafkaListeners {
    Logger logger = LoggerFactory.getLogger(KafkaListeners.class);

    @KafkaHandler
    public void listener(@Payload Cart cart, ConsumerRecord<String, Cart> cr) {
        logger.info("Topic [order] Received cart: {}", cart);
        logger.info(cr.toString());
    }
}
