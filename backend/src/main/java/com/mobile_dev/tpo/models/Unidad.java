package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "unidades")
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idunidad")
    private Long idUnidad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}