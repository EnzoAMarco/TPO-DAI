package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "pasos")
public class Paso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaso")
    private Long idPaso;

    @ManyToOne
    @JoinColumn(name = "idreceta", nullable = false)
    private Long idReceta;

    @Column(name = "urlfoto", length = 300)
    private String urlFoto;

    @Column(name = "extension", length = 5)
    private String extension;
}