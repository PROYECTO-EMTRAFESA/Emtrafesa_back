package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "itinerario")
public class Itinerario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_itinerario;

    @OneToMany(mappedBy = "itinerario")
    private List<Pasajero> pasajeros;

    @ManyToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "id_bus")
    private Bus bus;

    @OneToMany(mappedBy = "itinerario") // Relacionada con la clase Pasaje
    private List<Pasaje> pasajes;
}
