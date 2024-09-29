package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "apellidos", length = 150, nullable = false)
    private String apellidos;

    @OneToMany(mappedBy = "cliente")
    private List<DocumentoIdentidadCliente> documentoIdentidadCliente;

    @OneToMany(mappedBy = "cliente")
    private List<ClienteCorreo> correos;

    @OneToMany(mappedBy = "cliente")
    private List<ClienteTelefono> telefonos;
}
