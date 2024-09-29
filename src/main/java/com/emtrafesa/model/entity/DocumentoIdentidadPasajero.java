package com.emtrafesa.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "documento_identidad_pasajero")
public class DocumentoIdentidadPasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento_identidad_pasajero")
    private Long idDocumentoIdentidadPasajero;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;

    @Column(name = "numero", length = 20, nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private Pasajero pasajero;
}
