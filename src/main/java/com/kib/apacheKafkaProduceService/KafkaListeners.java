package com.kib.apacheKafkaProduceService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kibTopic",
            groupId = "groupId"
    )
    void listener(String data) {

        System.out.println("Listener received: " + data );
    }
}
