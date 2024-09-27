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
    private Long id_postergacion;

    // LocalDate para almacenar solo la fecha
    private LocalDate nueva_fecha_salida;

    // LocalTime para almacenar solo la hora
    private LocalTime nueva_hora_salida;

    @OneToOne(mappedBy = "postergacion")
    private Pasaje pasaje;
}

