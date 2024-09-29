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
    @Column(name = "id_pasajero")
    private Long idPasajero;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 50, nullable = false)
    private String apellidoMaterno;

    @Column(name = "sexo", length = 1, nullable = false) // M para Masculino, F para Femenino
    private String sexo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "pasajero")
    private List<DocumentoIdentidadPasajero> documentosIdentidadPasajero;

    @OneToMany(mappedBy = "pasajero")
    private List<PasajeroTelefono> pasajeroTelefonos;

    @ManyToOne
    @JoinColumn(name = "id_itinerario", nullable = false)
    private Itinerario itinerario;
}
