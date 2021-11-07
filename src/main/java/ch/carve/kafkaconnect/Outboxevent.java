package ch.carve.kafkaconnect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
public class Outboxevent {
    @Id
    private UUID id;
    private Instant timestamp;
    private String status;
    private String payload;
}
