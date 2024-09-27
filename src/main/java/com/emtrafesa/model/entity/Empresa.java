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
    private Long id_Empresa;

    private String nombre_Empresa;
    private String ruc;
    private String razon_social;

    @OneToMany(mappedBy = "empresa")
    private List<Pasaje> pasajes;

}
