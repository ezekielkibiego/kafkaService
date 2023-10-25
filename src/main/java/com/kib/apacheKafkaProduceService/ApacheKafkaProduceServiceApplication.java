package com.kib.apacheKafkaProduceService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ApacheKafkaProduceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaProduceServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return  args -> {
			for (int i = 0; i < 100; i++){
				kafkaTemplate.send("kibTopic", "Hello kafka:)" + i);
			}
		};
	}

}
