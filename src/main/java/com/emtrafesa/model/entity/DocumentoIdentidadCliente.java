package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "documento_identidad_cliente")
public class DocumentoIdentidadCliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_documento_identidad_cliente;

        @ManyToOne
        @JoinColumn(name = "id_tipo_documento")
        private TipoDocumento tipoDocumento;

        private int numero;

        @ManyToOne
        @JoinColumn(name = "id_Cliente")
        private Cliente cliente;
    }

