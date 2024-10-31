package ait.cohort46.service;

import ait.cohort46.dto.PulseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;
@Service
public class PulseDataConsumer {
    @Bean
    public Consumer<PulseDto> log() {
        return s -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            long delay = System.currentTimeMillis() - s.getTimestamp();
            System.out.println("delay: " + delay + ", payload " + s.getPayload());
        };
    }
}
