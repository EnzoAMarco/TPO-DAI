package com.mobile_dev.tpo.models;

public class Calificacion {
    private int idcalificacion;
    // one to many
    private int idusuario; //usuario de la calificacion no de la receta
   //one to many
    private int idreceta;
    private int calificacion;  //Si no utiliza un valr numerico hay que cambiar el tipo
    private String comentarios;
    //constraint fk_calificaciones_usuarios foreign key (idUsuario) references usuarios,
    //constraint fk_calificaciones_recetas foreign key (idReceta) references recetas
}
