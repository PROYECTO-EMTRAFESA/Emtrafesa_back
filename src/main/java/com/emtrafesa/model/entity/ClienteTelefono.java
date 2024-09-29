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
    @Column(name = "id_cliente_telefono")
    private Long idClienteTelefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 10)
    private TipoTelefono tipo;

    @Column(name = "numero", length = 15, nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
