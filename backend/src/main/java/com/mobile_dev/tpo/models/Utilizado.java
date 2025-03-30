package com.mobile_dev.tpo.models;
// ver si tenemos que usar listas

public class Utilizado {
    private int idutilizado;
    private int idreceta;
    private int idingrediente;
    private int cantidad;
    private int idunidad;
    private String obvservaciones; //son comentarios sobre el ingrediente
    //constraint fk_utilizados_recetas foreign key (idReceta) references recetas,
    //constraint fk_utilizados_ingredientes foreign key (idIngrediente) references ingredientes,
    //constraint fk_utilizados_unidades foreign key (idUnidad) references unidades



}






