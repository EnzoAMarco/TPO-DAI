package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pasos")
@Getter
@Setter
public class Paso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaso")
    private Long idPaso;

    @ManyToOne
    @JoinColumn(name = "idreceta", nullable = false)
    private Receta receta;

    @Column(name = "urlfoto", length = 300)
    private String urlFoto;

    @Column(name = "extension", length = 5)
    private String extension;

    @OneToMany(mappedBy = "paso", fetch = FetchType.EAGER)
    private List<Multimedia> multimedia;

    public Paso() {
    }
}