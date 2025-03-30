package com.mobile_dev.tpo.models;

public class Unidad {
    private int idunidad;
    private String descripcion;


    public Unidad() {
    }

    public Unidad(int idunidad, String descripcion) {
        this.idunidad = idunidad;
        this.descripcion = descripcion;
    }

    public int getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(int idunidad) {
        this.idunidad = idunidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
