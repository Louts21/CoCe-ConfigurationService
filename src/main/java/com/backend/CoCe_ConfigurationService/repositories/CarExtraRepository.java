package com.backend.CoCe_ConfigurationService.repositories;

import com.backend.CoCe_ConfigurationService.models.CarExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarExtraRepository extends JpaRepository<CarExtra, Long> {
}
