package com.mobile_dev.tpo.models;

import java.util.List;

public class Alumno {
    //idalumno seria tanto la clave primaria como la foranea y se haria one to one , ver si se puede hacer o preguntarle al profe
    private int idalumno;
    private String numerotarjeta;
    private String dnifrente; //url
    private String dnifondo; //url
    private String tramite;
    private double cuentacorriente; //decimal(12,2),
    private List<Curso> cursos;

}
