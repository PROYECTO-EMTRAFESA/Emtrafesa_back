package com.emtrafesa.model.entity;

import com.emtrafesa.model.enums.TipoTelefono;
import jakarta.persistence.*;

@Entity
@Table(name = "pasajero_telefonos")
public class PasajeroTelefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pasajero_telefonos;

    @Enumerated(EnumType.STRING)
    private TipoTelefono tipo;

    private int numero;

    @ManyToOne
    @JoinColumn(name = "id_Pasajero")
    private Pasajero pasajero;
}

