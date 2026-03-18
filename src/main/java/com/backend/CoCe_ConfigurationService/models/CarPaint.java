package com.backend.CoCe_ConfigurationService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_paints")
@Getter
@Setter
public class CarPaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private long price;
    private LocalDateTime createdAt;

    public CarPaint() {
    }

    public CarPaint(Long id, String name, long price, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }

}
