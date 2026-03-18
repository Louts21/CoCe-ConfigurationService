package com.backend.CoCe_ConfigurationService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/healthy")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Configuration Service is up and running!", HttpStatus.OK);
    }

}
