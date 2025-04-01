package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ingredientes")
@Getter
@Setter
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingrediente")
    private Long idIngrediente;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "ingrediente", fetch = FetchType.EAGER)
    private List<Utilizado> utilizados;

    public Ingrediente() {
    }
}

