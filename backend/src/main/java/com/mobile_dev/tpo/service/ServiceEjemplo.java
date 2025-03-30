package com.mobile_dev.tpo.service;

import com.mobile_dev.tpo.service.Iservice.IEjemplo;

public class ServiceEjemplo implements IEjemplo {

    /*
     * INYECCION X CONSTRUCTOR
     * INYECCION X CONSTRUCTOR
     *
     * private INTERFAZ DEL SERVICIO/REPOSITORY NOMBRE (atributo que voy a llamar en el constructor)
    */

    /*
    *CONSTRUCTOR
    *CONSTRUCTOR
    *
    *   public Ejemplo (SERVICIO/REPOSITORY NombreDelAtributo(que llame arriba) {
    *       this.NombreDelAtributo = NombreDelAtributo(el que se pasa por parametros)
    *   }
    */

    @Override
    public String ejemplo(String txt) {
        //implementacion
        return txt;
    }

}
