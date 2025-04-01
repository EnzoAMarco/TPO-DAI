package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

import java.util.List;

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

    @ManyToMany(mappedBy = "cursos", fetch = FetchType.EAGER)
    private List<Alumno> alumnos;

    @OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
    private List<CronogramaCurso> cronogramaCursos;
}