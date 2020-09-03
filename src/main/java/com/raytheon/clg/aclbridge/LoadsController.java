package com.raytheon.clg.aclbridge;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class LoadsController {

    @GetMapping(value = "/loads", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Load>> getLoads(){
        List<Load> loads =
                Arrays.asList(new Load(UUID.randomUUID(), "Load One", Instant.now())
                , new Load(UUID.randomUUID(), "Load Two", Instant.now())
                , new Load(UUID.randomUUID(), "Load Three", Instant.now()));

        return ResponseEntity.ok(loads);
    }
}
