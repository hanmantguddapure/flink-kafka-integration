package com.flink.kafkaflinkintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flink.kafkaflinkintegration.config.FlinkKafkaReceiver;

@SpringBootApplication
public class KafkaFlinkIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaFlinkIntegrationApplication.class, args);
		try {
			try {
				FlinkKafkaReceiver.StramConsumrer("flink-test", "localhost:9092");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
