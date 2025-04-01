package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcalificacion")
    private Long idCalificacion;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private Receta receta;

    @Column(name = "calificacion")
    private Long calificacion;

    @Column(name = "comentarios")
    private String comentarios;
}