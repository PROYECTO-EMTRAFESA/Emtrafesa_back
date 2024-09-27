package com.emtrafesa.model.entity;

import com.emtrafesa.model.enums.TipoTelefono;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente_telefonos")
public class ClienteTelefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente_Telefono;

    @Enumerated(EnumType.STRING)
    private TipoTelefono tipo;

    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
