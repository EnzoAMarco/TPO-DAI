package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios", schema = "tpo_dai")
public class Usuario {
    @Id
    @Column(name="idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name="mail")
    private String mail;

    @Column(name="nickname")
    private String nickname;

    @Column(name="password")
    private String password;

    @Column(name="habilitado")
    private String habilitado;//solo puede ser si o no

    @Column(name="nombre")
    private String nombre;

    @Column(name="direccion")
    private String direccion;

    @Column(name="avatar")
    private String avatar;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Receta>receta;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Calificacion> calificacion;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Alumno alumno;
}
