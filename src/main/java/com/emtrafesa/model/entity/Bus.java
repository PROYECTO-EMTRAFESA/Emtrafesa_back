package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bus;

    private String servicio;

    @OneToOne
    @JoinColumn(name = "id_detalle_bus")
    private DetalleBus detalleBus;
}
