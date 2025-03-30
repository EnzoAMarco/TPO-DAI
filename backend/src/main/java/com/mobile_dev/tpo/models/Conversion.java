package com.mobile_dev.tpo.models;

public class Conversion {
    private int idconversion;
    private int idunidadorigen;
    private int idunidaddestino;
    private float factorconversiones;
    //constraint fk_unidad_origen foreign key (idUnidadOrigen) references unidades (idUnidad),
    //constraint fk_unidad_destino foreign key (idUnidadDestino) references unidades (idUnidad)
}
