package com.mobile_dev.tpo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios", schema = "tpo_dai")
public class Usuario {

    private int idusuario;
    private String mail;
    private String nickname;
    private String password;
    private String habilitado; //solo puede ser si o no
    private String nombre;
    private String direccion;
    private String avatar;
    
}
