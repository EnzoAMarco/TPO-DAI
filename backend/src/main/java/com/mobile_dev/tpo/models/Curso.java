package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    private long idCurso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "contenidos")
    private String contenidos;

    @Column(name = "requerimientos")
    private String requerimientos;

    @Column(name = "duracion")
    private Long duracion;

    @Column(name = "precio")
    private float precio;

    @Column(name = "modalidad")
    private String modalidad;
}