package com.backend.CoCe_ConfigurationService.controller;

import com.backend.CoCe_ConfigurationService.model.Configuration;
import com.backend.CoCe_ConfigurationService.repository.ConfigurationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class ConfigurationControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ConfigurationRepository configurationRepository;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        configurationRepository.deleteAll();
    }

    @Test
    void getConfiguration_returnsConfiguration_whenFound() throws Exception {
        Configuration saved = configurationRepository.save(
                new Configuration(null, "testKey", "testValue", "testDescription")
        );

        mockMvc.perform(get("/configurations/{id}", saved.getId())
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(saved.getId()))
                .andExpect(jsonPath("$.configKey").value("testKey"))
                .andExpect(jsonPath("$.configValue").value("testValue"))
                .andExpect(jsonPath("$.description").value("testDescription"));
    }

    @Test
    void getConfiguration_returnsNotFound_whenMissing() throws Exception {
        mockMvc.perform(get("/configurations/{id}", 999999L)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
