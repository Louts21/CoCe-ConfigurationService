package com.backend.CoCe_ConfigurationService.repositories;

import com.backend.CoCe_ConfigurationService.models.CarWheel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWheelRepository extends JpaRepository<CarWheel, Long> {
}
