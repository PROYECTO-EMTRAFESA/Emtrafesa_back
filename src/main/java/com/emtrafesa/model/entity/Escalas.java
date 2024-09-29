package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "escalas")
public class Escalas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_escalas")
    private Long idEscalas;

    @Column(name = "numero_escalas", nullable = false)
    private int numeroEscalas;

    @ManyToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;
}
