package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asistenciacursos")
public class AsistenciaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasistencia")
    private Long idAsistencia;

    @ManyToOne
    @JoinColumn(name = "idalumno")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "idcronograma")
    private CronogramaCurso cronogramaCurso;

    @Column(name = "fecha")
    private LocalDate fecha;
}