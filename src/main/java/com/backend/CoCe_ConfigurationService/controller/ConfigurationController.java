package com.backend.CoCe_ConfigurationService.controller;

import com.backend.CoCe_ConfigurationService.model.Configuration;
import com.backend.CoCe_ConfigurationService.repository.ConfigurationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configurations")
public class ConfigurationController {

    private final ConfigurationRepository configurationRepository;

    public ConfigurationController(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Configuration> getConfiguration(@PathVariable Long id) {
        return configurationRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
