package com.mobile_dev.tpo.models;

public class Receta {
    //id receta primary key y a su vez es una foranea one to many one estipo de receta y many es id receta
    private int idreceta;
    // otro one to many
    private int idusuario;
    private String nombrereceta;
    private String descripcionreceta;
    private String fotoprincipal;
    private int porciones;
    private int cantidadpersonas;
    private int idtipo;
}