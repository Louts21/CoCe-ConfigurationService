package com.backend.CoCe_ConfigurationService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConfigurationDTO {

    private CarModelDTO[] carModelDTO;
    private CarEngineDTO[] carEngineDTO;
    private CarPaintDTO[] carPaintDTO;
    private CarWheelDTO[] carWheelDTO;
    private CarExtraDTO[] carExtraDTO;

    public ConfigurationDTO(CarModelDTO[] carModelDTO, CarEngineDTO[] carEngineDTO, CarPaintDTO[] carPaintDTO,
                            CarWheelDTO[] carWheelDTO, CarExtraDTO[] carExtraDTO) {
        this.carModelDTO = carModelDTO;
        this.carEngineDTO = carEngineDTO;
        this.carPaintDTO = carPaintDTO;
        this.carWheelDTO = carWheelDTO;
        this.carExtraDTO = carExtraDTO;
    }

}
