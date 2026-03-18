package com.backend.CoCe_ConfigurationService.repositories;

import com.backend.CoCe_ConfigurationService.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long> {
}
