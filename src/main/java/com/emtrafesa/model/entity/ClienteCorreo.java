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
    @Column(name = "id_cliente_correo")
    private Long idClienteCorreo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 10)
    private TipoCorreo tipo;

    @Column(name = "correo", length = 100, nullable = false)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
