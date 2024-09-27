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
    private Long id_Pasaje;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private Empresa empresa;

    private Date fecha_y_hora_salida;

    @OneToOne
    @JoinColumn(name = "id_pago")
    private Pago pago;

    @OneToOne
    @JoinColumn(name = "id_postergacion")
    private Postergacion postergacion;

    @ManyToOne
    @JoinColumn(name = "id_Itinerario")
    private Itinerario itinerario;

}
