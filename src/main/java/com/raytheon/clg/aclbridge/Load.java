package com.raytheon.clg.aclbridge;


import java.time.Instant;
import java.util.UUID;


public class Load {
    private UUID id;
    private String description;
    private Instant when;

    public Load(UUID id, String description, Instant when) {
        this.id = id;
        this.description = description;
        this.when = when;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Instant getWhen() {
        return when;
    }
}
