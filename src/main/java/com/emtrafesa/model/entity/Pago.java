package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pago;

    private Double importe;
    private String numero_tarjeta;
    private String moneda;

    @OneToOne(mappedBy = "pago")
    private Pasaje pasaje;

}
