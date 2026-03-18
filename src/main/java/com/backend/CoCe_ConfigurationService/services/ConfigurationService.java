package com.backend.CoCe_ConfigurationService.services;

import com.backend.CoCe_ConfigurationService.Mapper;
import com.backend.CoCe_ConfigurationService.models.*;
import com.backend.CoCe_ConfigurationService.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {

    private final CarEngineRepository carEngineRepository;
    private final CarExtraRepository carExtraRepository;
    private final CarModelRepository carModelRepository;
    private final CarPaintRepository carPaintRepository;
    private final CarWheelRepository carWheelRepository;

    public ConfigurationService(CarEngineRepository carEngineRepository,
                                CarExtraRepository carExtraRepository,
                                CarModelRepository carModelRepository,
                                CarPaintRepository carPaintRepository,
                                CarWheelRepository carWheelRepository) {
        this.carEngineRepository = carEngineRepository;
        this.carExtraRepository = carExtraRepository;
        this.carModelRepository = carModelRepository;
        this.carPaintRepository = carPaintRepository;
        this.carWheelRepository = carWheelRepository;
    }

    public Configuration getConfiguration() {
        List<CarEngine> engines = carEngineRepository.findAll();
        List<CarExtra> extras = carExtraRepository.findAll();
        List<CarModel> models = carModelRepository.findAll();
        List<CarPaint> paints = carPaintRepository.findAll();
        List<CarWheel> wheels = carWheelRepository.findAll();

        CarEngineDTO[] engineDTOs = engines.stream()
                .map(Mapper::carEngineDTO)
                .toArray(CarEngineDTO[]::new);

        CarExtraDTO[] extraDTOs = extras.stream()
                .map(Mapper::toCarExtraDTO)
                .toArray(CarExtraDTO[]::new);

        CarModelDTO[] modelDTOs = models.stream()
                .map(Mapper::toCarModelDTO)
                .toArray(CarModelDTO[]::new);

        CarPaintDTO[] paintDTOs = paints.stream()
                .map(Mapper::carPaintDTO)
                .toArray(CarPaintDTO[]::new);

        CarWheelDTO[] wheelDTOs = wheels.stream()
                .map(Mapper::toCarWheelDTO)
                .toArray(CarWheelDTO[]::new);

        return new Configuration(modelDTOs, engineDTOs, paintDTOs, wheelDTOs, extraDTOs);
    }

}
