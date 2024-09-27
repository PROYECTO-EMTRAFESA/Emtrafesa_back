package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "escalas")
public class Escalas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_escalas;

    private int numero_escalas;

    @ManyToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;
}
