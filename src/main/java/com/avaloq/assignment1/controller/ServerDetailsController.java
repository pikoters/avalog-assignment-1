package com.avaloq.assignment1.controller;

import com.avaloq.assignment1.controller.dto.ServerDetails;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerDetailsController {

    @GetMapping(path = "/server/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity retrieveServerDetails() {
        return ResponseEntity.ok(new ServerDetails());
    }
}
