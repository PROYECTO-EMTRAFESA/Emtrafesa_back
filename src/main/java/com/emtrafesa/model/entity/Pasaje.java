package com.emtrafesa.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "pasaje")
public class Pasaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasaje")
    private Long idPasaje;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

    @Column(name = "fecha_y_hora_salida", nullable = false)
    private Date fechaYHoraSalida;

    @OneToOne
    @JoinColumn(name = "id_pago")
    private Pago pago;

    @OneToOne
    @JoinColumn(name = "id_postergacion")
    private Postergacion postergacion;

    @ManyToOne
    @JoinColumn(name = "id_itinerario", nullable = false)
    private Itinerario itinerario;
}
