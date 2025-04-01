package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fotos")
@Getter
@Setter
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfoto")
    private Long idFoto;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private Receta receta;

    @Column(name = "urlfoto")
    private String urlFoto;

    @Column(name = "extension")
    private String extension;

    public Foto() {
    }
}