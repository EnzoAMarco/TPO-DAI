package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "utilizados")
public class Utilizado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idutilizado")
    private Long idUtilizado;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private Long idReceta;

    @ManyToOne
    @JoinColumn(name = "idingrediente")
    private Long idIngrediente;

    @Column(name = "cantidad")
    private Long cantidad;

    @ManyToOne
    @JoinColumn(name = "idunidad")
    private Long idUnidad;

    @Column(name = "observaciones")
    private String observaciones;
}