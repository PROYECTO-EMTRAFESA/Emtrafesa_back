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
    private Long id_Cliente;

    private String nombre;
    private String apellidos;

    @OneToMany(mappedBy = "cliente")
    private List<DocumentoIdentidadCliente> documentoIdentidadCliente;

    @OneToMany(mappedBy = "cliente")
    private List<ClienteCorreo> correos;

    @OneToMany(mappedBy = "cliente")
    private List<ClienteTelefono> telefonos;
}
