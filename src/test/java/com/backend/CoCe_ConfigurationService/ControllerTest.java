package com.backend.CoCe_ConfigurationService;

import com.backend.CoCe_ConfigurationService.models.*;
import com.backend.CoCe_ConfigurationService.services.ConfigurationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

    @Mock
    private ConfigurationService configurationService;

    @InjectMocks
    private Controller controller;

    @Test
    void getConfiguration_returnsOkWithConfigurationDTO() {
        ConfigurationDTO dto = new ConfigurationDTO(
                new CarModelDTO[]{new CarModelDTO("1", "Model S", 50000)},
                new CarEngineDTO[]{new CarEngineDTO("1", "V8", 8000)},
                new CarPaintDTO[]{new CarPaintDTO("1", "Red", 500)},
                new CarWheelDTO[]{new CarWheelDTO("1", "Alloy 18\"", 1200)},
                new CarExtraDTO[]{new CarExtraDTO("1", "Sunroof", 1500)}
        );
        when(configurationService.getConfiguration()).thenReturn(dto);

        ResponseEntity<ConfigurationDTO> response = controller.getConfiguration();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Model S", response.getBody().getCarModelDTO()[0].getName());
        assertEquals("V8", response.getBody().getCarEngineDTO()[0].getName());
        assertEquals("Red", response.getBody().getCarPaintDTO()[0].getName());
        assertEquals("Alloy 18\"", response.getBody().getCarWheelDTO()[0].getName());
        assertEquals("Sunroof", response.getBody().getCarExtraDTO()[0].getName());
    }

    @Test
    void healthCheck_returnsOk() {
        ResponseEntity<String> response = controller.healthCheck();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Configuration Service is up and running!", response.getBody());
    }

}

