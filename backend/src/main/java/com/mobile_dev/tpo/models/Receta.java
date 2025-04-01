package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "recetas", schema = "tpo_dai")
public class Receta {
    //id receta primary key y a su vez es una foranea one to many one estipo de receta y many es id receta
    @Id
    @Column(name="idreceta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReceta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtipo")
    private TipoReceta tipoReceta;

    @OneToMany(mappedBy = "receta", fetch = FetchType.EAGER)
    private List<Calificacion> calificacion ;

    @OneToMany(mappedBy = "receta", fetch = FetchType.EAGER)
    private List<Foto> fotos;

    @OneToMany(mappedBy = "receta", fetch = FetchType.EAGER)
    private List<Paso> pasos;

    @OneToMany(mappedBy = "receta", fetch = FetchType.EAGER)
    private List<Utilizado> utilizados;



}
