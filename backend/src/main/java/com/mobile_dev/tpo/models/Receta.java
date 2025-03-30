package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "recetas", schema = "tpo_dai")
public class Receta {
    //id receta primary key y a su vez es una foranea one to many one estipo de receta y many es id receta
    @Id
    @Column(name="idreceta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReceta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUsuario")
    @Column(name="idusuario")
    private Long idUsuario;

    @Column(name="nombrereceta")
    private String nombreReceta;

    @Column(name="descripcionreceta")
    private String descripcionReceta;

    @Column(name="fotoprincipal")
    private String fotoPrincipal;

    @Column(name="porciones")
    private int porciones;

    @Column(name="cantidadpersonas")
    private int cantidadPersonas;

    @Column(name="idtipo")
    private Long idTipo;



}
