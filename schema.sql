CREATE TABLE processed_event
(
    event_id uuid PRIMARY KEY,
    processed_at TIMESTAMP NOT NULL
);

CREATE TABLE outboxevent
(
    id uuid PRIMARY KEY,
    timestamp TIMESTAMP NOT NULL,
    status VARCHAR(20) not null,
    payload varchar(4096) NOT NULL
);
