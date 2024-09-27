package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_bus")
public class DetalleBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle_bus;

    private int asientos;
    private String ambiente;
}
