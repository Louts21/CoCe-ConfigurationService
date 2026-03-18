package com.backend.CoCe_ConfigurationService.repositories;

import com.backend.CoCe_ConfigurationService.models.CarPaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPaintRepository extends JpaRepository<CarPaint, Long> {
}
