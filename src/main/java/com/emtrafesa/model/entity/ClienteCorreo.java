package com.emtrafesa.model.entity;

import com.emtrafesa.model.enums.TipoCorreo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente_correos")
public class ClienteCorreo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ClienteCorreo;

    @Enumerated(EnumType.STRING)
    private TipoCorreo tipo;

    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

}

