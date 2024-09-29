package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "postergacion")
public class Postergacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_postergacion")
    private Long idPostergacion;

    @Column(name = "nueva_fecha_salida", nullable = false)
    private LocalDate nuevaFechaSalida;

    @Column(name = "nueva_hora_salida", nullable = false)
    private LocalTime nuevaHoraSalida;

    @OneToOne(mappedBy = "postergacion")
    private Pasaje pasaje;
}
