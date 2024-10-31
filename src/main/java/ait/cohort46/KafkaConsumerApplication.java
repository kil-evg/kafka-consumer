package ait.cohort46;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

    @Bean
    public Consumer<String> log() {
        return s -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String[] data = s.split(" : ");
            long delay = System.currentTimeMillis() - Long.parseLong(data[1]);
            System.out.println("delay: " + delay + ", payload" + data[0]);
        };
    }
}


