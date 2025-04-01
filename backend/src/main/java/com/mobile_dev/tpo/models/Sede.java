package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sedes")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private Long idSede;

    @Column(name = "nombresede")
    private String nombreSede;

    @Column(name = "direccionsede")
    private String direccionSede;

    @Column(name = "telefonosede")
    private String telefonoSede;

    @Column(name = "mailsede")
    private String mailSede;

    @Column(name = "whatsapp")
    private String whatsapp;

    @Column(name = "tipobonificacion")
    private String tipoBonificacion;

    @Column(name = "bonificacioncursos")
    private float bonificacionCursos;

    @Column(name = "tipopromocion")
    private String tipoPromocion;

    @Column(name = "promocioncursos")
    private float promocionCursos;

    @OneToMany(mappedBy = "sede", fetch = FetchType.EAGER)
    private List<CronogramaCurso> cronogramaCursos;
}