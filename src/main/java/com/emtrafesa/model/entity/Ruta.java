package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ruta")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Ruta;

    private String duracion;

    @OneToMany(mappedBy = "ruta")
    private List<Escalas> escalas;
}
