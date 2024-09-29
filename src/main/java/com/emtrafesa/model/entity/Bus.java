package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bus")
    private Long idBus;

    @Column(name = "servicio", length = 50, nullable = false)
    private String servicio;

    @OneToOne
    @JoinColumn(name = "id_detalle_bus")
    private DetalleBus detalleBus;
}
