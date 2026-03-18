package com.backend.CoCe_ConfigurationService.repositories;

import com.backend.CoCe_ConfigurationService.models.CarEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarEngineRepository extends JpaRepository<CarEngine, Long> {
}
