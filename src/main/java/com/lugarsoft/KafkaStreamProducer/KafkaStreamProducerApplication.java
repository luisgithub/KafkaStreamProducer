package com.lugarsoft.KafkaStreamProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaStreamProducerApplication {

	private static final Logger logger = LoggerFactory.getLogger(KafkaStreamProducerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamProducerApplication.class, args);
		logger.info("Running kafka producer...");
	}

}
