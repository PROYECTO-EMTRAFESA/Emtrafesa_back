package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "nombre_empresa", length = 100, nullable = false)
    private String nombreEmpresa;

    @Column(name = "ruc", length = 11, nullable = false)
    private String ruc;

    @Column(name = "razon_social", length = 150)
    private String razonSocial;

    @OneToMany(mappedBy = "empresa")
    private List<Pasaje> pasajes;
}
