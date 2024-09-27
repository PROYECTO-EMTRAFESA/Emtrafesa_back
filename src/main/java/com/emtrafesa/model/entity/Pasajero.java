package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "pasajero")
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pasajero;

    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String sexo;
    private Date fecha_nacimiento;

    @OneToMany(mappedBy = "pasajero")
    private List<DocumentoIdentidadPasajero> documentosIdentidadpasajero;

    @OneToMany(mappedBy = "pasajero")
    private List<PasajeroTelefono> pasajeroTelefonos;

    @ManyToOne
    @JoinColumn(name = "id_itinerario")
    private Itinerario itinerario;

}

