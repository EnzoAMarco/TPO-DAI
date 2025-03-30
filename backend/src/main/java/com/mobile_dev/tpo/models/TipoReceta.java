package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposreceta", schema = "tpo_dai")
public class TipoReceta {

    @Id
    @Column(name="idtipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;

    @Column(name="descripcion")
    private String descripcion;


}
