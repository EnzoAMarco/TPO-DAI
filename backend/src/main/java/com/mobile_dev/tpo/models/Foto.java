package com.mobile_dev.tpo.models;

public class Foto {
    private int idfoto;
    //one to many
    private int idreceta;
    private String urlfoto;
    private String extension;
    //constraint fk_fotos_recetas foreign key (idReceta) references recetas
}
