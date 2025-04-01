package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cronogramacursos")
@Getter
@Setter
public class CronogramaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcronograma")
    private Long idCronograma;

    @ManyToOne
    @JoinColumn(name = "idsede")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;

    @Column(name = "fechainicio")
    private LocalDate fechaInicio;

    @Column(name = "fechafin")
    private LocalDate fechaFin;

    @Column(name = "vacantesdisponibles")
    private int vacantesDisponibles;

    @OneToMany(mappedBy = "cronogramaCurso", fetch = FetchType.EAGER)
    private List<AsistenciaCurso> asistenciaCursos;

    public CronogramaCurso() {
    }
}