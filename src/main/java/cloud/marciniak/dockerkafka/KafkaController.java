package cloud.marciniak.dockerkafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping ("/api/kafka")
@RestController
public class KafkaController {
    final KafkaTemplate kafkaTemplate;

    public KafkaController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public Cart sentCart(@RequestBody Cart cart) {
        this.kafkaTemplate.send("order", cart);
        return cart;
    }

}
