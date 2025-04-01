package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "alumnos", schema = "tpo_dai")
@Getter
@Setter
public class Alumno {
    //idalumno seria tanto la clave primaria como la foranea y se haria one to one , ver si se puede hacer o preguntarle al profe

    @Id
    @Column(name="idalumno")
    private Long idAlumno;

    @OneToOne
    @MapsId
    @JoinColumn(name="idalumno")
    private Usuario usuario;

    @Column(name="numerotarjeta")
    private String numeroTarjeta;

    @Column(name="idaludnifrentemno")
    private String dniFrente;//url

    @Column(name="dnifondo")
    private String dniFondo; //url

    @Column(name="tramite")
    private String tramite;

    @Column(name="cuentacorriente")
    private double cuentaCorriente; //decimal(12,2),

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "alumnoCurso",
            joinColumns = @JoinColumn(name = "idalumno"),
            inverseJoinColumns = @JoinColumn(name = "idcurso")
    )
    private List<Curso> cursos;

    @OneToMany(mappedBy = "alumno", fetch = FetchType.EAGER)
    private List<AsistenciaCurso> asistenciaCursos;


    public Alumno() {
    }
}

