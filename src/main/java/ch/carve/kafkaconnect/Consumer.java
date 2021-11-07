package ch.carve.kafkaconnect;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@Slf4j
@ApplicationScoped
public class Consumer {

    @Incoming("temp")
    public void consume(String event) {
        log.info("Received: {}", event);
    }
}
