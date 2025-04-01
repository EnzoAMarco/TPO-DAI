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
    private Receta receta;

    @ManyToOne
    @JoinColumn(name = "idingrediente")
    private Ingrediente ingrediente;

    @Column(name = "cantidad")
    private Long cantidad;

    @ManyToOne
    @JoinColumn(name = "idunidad")
    private Unidad unidad;

    @Column(name = "observaciones")
    private String observaciones;
}