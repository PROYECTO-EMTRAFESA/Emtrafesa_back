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
    @Column(name = "id_ruta")
    private Long idRuta;

    @Column(name = "duracion", length = 20, nullable = false) // Puede ser un texto que describa la duración (ej: "4h 30min")
    private String duracion;

    @OneToMany(mappedBy = "ruta")
    private List<Escalas> escalas;
}
