package com.backend.CoCe_ConfigurationService;

import com.backend.CoCe_ConfigurationService.models.*;

import java.time.LocalDateTime;

public class Mapper {

    public static CarEngine toCarEngine(CarEngineDTO carEngineDTO) {
        return new CarEngine(Long.getLong(carEngineDTO.getId()), carEngineDTO.getName(), carEngineDTO.getPrice(),
                LocalDateTime.now());
    }
    public static CarEngineDTO carEngineDTO(CarEngine carEngine) {
        return new CarEngineDTO(carEngine.getId().toString(), carEngine.getName(), carEngine.getPrice());
    }

    public static CarExtra toCarExtra(CarExtraDTO carExtraDTO) {
        return new CarExtra(Long.getLong(carExtraDTO.getId()), carExtraDTO.getName(), carExtraDTO.getPrice(),
                LocalDateTime.now());
    }
    public static CarExtraDTO toCarExtraDTO(CarExtra carExtra) {
        return new CarExtraDTO(carExtra.getId().toString(), carExtra.getName(), carExtra.getPrice());
    }

    public static CarModel toCarModel(CarModelDTO carModelDTO) {
        return new CarModel(Long.getLong(carModelDTO.getId()), carModelDTO.getName(), carModelDTO.getPrice(),
                LocalDateTime.now());
    }
    public static CarModelDTO toCarModelDTO(CarModel carModel) {
        return new CarModelDTO(carModel.getId().toString(), carModel.getName(), carModel.getPrice());
    }

    public static CarPaint toCarPaint(CarPaintDTO carPaintDTO) {
        return new CarPaint(Long.getLong(carPaintDTO.getId()), carPaintDTO.getName(), carPaintDTO.getPrice(),
                LocalDateTime.now());
    }
    public static CarPaintDTO carPaintDTO(CarPaint carPaint) {
        return new CarPaintDTO(carPaint.getId().toString(), carPaint.getName(), carPaint.getPrice());
    }

    public static CarWheel toCarWheel(CarWheelDTO carWheelDTO) {
        return new CarWheel(Long.getLong(carWheelDTO.getId()), carWheelDTO.getName(), carWheelDTO.getPrice(),
                LocalDateTime.now());
    }
    public static CarWheelDTO toCarWheelDTO(CarWheel carWheel) {
        return new CarWheelDTO(carWheel.getId().toString(), carWheel.getName(), carWheel.getPrice());
    }

}
