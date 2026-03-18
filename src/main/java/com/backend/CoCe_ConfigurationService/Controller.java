package com.backend.CoCe_ConfigurationService;

import com.backend.CoCe_ConfigurationService.models.Configuration;
import com.backend.CoCe_ConfigurationService.services.ConfigurationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final ConfigurationService configurationService;

    public Controller(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping("/healthy")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Configuration Service is up and running!", HttpStatus.OK);
    }

    @GetMapping("/configuration")
    public ResponseEntity<Configuration> getConfiguration() {
        return new ResponseEntity<>(configurationService.getConfiguration(), HttpStatus.OK);
    }

}
