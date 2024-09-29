package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_bus")
public class DetalleBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_bus")
    private Long idDetalleBus;

    @Column(name = "asientos", nullable = false)
    private int asientos;

    @Column(name = "ambiente", length = 50)
    private String ambiente;
}
