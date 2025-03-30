package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredientes")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingrediente")
    private Long idIngrediente;

    @Column(name = "nombre")
    private String nombre;
}

