package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long idPago;

    @Column(name = "importe", nullable = false)
    private Double importe;

    @Column(name = "numero_tarjeta", length = 16, nullable = false) // Longitud común de tarjetas de crédito
    private String numeroTarjeta;

    @Column(name = "moneda", length = 3, nullable = false) // ISO 4217 currency codes (ej: USD, EUR, etc.)
    private String moneda;

    @OneToOne(mappedBy = "pago")
    private Pasaje pasaje;
}
