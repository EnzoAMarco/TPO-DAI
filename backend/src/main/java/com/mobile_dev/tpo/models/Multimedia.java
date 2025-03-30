package com.mobile_dev.tpo.models;

public class Multimedia {
    private int idcontenido;
    //one to many
    private int idpaso;
    private String tipo_contenido; //solo puede ser: 'foto','video','audio'
    private String extension;
    private String urlcontenido;
    //constraint fk_multimedia_pasos foreign key (idPaso) references pasos
}
