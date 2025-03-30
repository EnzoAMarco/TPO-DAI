package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cronogramacursos")
public class CronogramaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcronograma")
    private Long idCronograma;

    @ManyToOne
    @JoinColumn(name = "idsede")
    private Long idSede;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Long idCurso;

    @Column(name = "fechainicio")
    private LocalDate fechaInicio;

    @Column(name = "fechafin")
    private LocalDate fechaFin;

    @Column(name = "vacantesdisponibles")
    private Long vacantesDisponibles;
}