package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "fotos")
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfoto")
    private Long idFoto;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private Long idReceta;

    @Column(name = "urlfoto")
    private String urlFoto;

    @Column(name = "extension")
    private String extension;
}