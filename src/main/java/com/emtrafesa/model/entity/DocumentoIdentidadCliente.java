package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "documento_identidad_cliente")
public class DocumentoIdentidadCliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_documento_identidad_cliente")
        private Long idDocumentoIdentidadCliente;

        @ManyToOne
        @JoinColumn(name = "id_tipo_documento")
        private TipoDocumento tipoDocumento;

        @Column(name = "numero", length = 20, nullable = false)
        private String numero;

        @ManyToOne
        @JoinColumn(name = "id_cliente")
        private Cliente cliente;
}
