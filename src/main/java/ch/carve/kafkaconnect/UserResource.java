package ch.carve.kafkaconnect;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.time.Instant;
import java.util.UUID;

@Slf4j
@Path("user")
public class UserResource {

    @Inject
    EntityManager entityManager;

    @Transactional
    @POST
    public Response createUser(User user) {
        log.info("user: " + user);
        Outboxevent event = new Outboxevent();
        event.setId(UUID.randomUUID());
        event.setTimestamp(Instant.now());
        event.setStatus("created");
        event.setPayload(user.toString());
        entityManager.persist(event);
        return Response.ok().build();
    }

}
