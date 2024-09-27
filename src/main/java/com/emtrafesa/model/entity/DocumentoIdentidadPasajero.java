package com.emtrafesa.model.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "documento_identidad_pasajero")
    public class DocumentoIdentidadPasajero {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_documento_identidad_pasajero;

        @ManyToOne
        @JoinColumn(name = "id_tipo_documento")
        private TipoDocumento tipoDocumento;

        private int numero;

        @ManyToOne
        @JoinColumn(name = "id_Pasajero")
        private Pasajero pasajero;
    }
