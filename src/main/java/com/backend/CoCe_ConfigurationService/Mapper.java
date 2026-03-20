package com.backend.CoCe_ConfigurationService;

import com.backend.CoCe_ConfigurationService.models.*;

import java.time.LocalDateTime;

public class Mapper {

    public static CarEngineDTO carEngineDTO(CarEngine carEngine) {
        return new CarEngineDTO(carEngine.getId().toString(), carEngine.getName(), carEngine.getPrice());
    }

    public static CarExtraDTO toCarExtraDTO(CarExtra carExtra) {
        return new CarExtraDTO(carExtra.getId().toString(), carExtra.getName(), carExtra.getPrice());
    }

    public static CarModelDTO toCarModelDTO(CarModel carModel) {
        return new CarModelDTO(carModel.getId().toString(), carModel.getName(), carModel.getPrice());
    }

    public static CarPaintDTO carPaintDTO(CarPaint carPaint) {
        return new CarPaintDTO(carPaint.getId().toString(), carPaint.getName(), carPaint.getPrice());
    }

    public static CarWheelDTO toCarWheelDTO(CarWheel carWheel) {
        return new CarWheelDTO(carWheel.getId().toString(), carWheel.getName(), carWheel.getPrice());
    }

}
