package com.emtrafesa.model.entity;

import com.emtrafesa.model.enums.TipoTelefono;
import jakarta.persistence.*;

@Entity
@Table(name = "pasajero_telefonos")
public class PasajeroTelefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasajero_telefono")
    private Long idPasajeroTelefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoTelefono tipo;

    @Column(name = "numero", length = 9, nullable = false) // Longitud común para números de celular
    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_pasajero", nullable = false)
    private Pasajero pasajero;
}
