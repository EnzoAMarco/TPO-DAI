package com.mobile_dev.tpo.models;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class AsistenciaCurso {
    private int idasistencia;
    private int idalumno;
    private int idcronograma;
    private LocalDate fecha; //¿?
    //constraint fk_asistenciaCursos_alumnos foreign key (idAlumno) references alumnos,
    //constraint fk_asistenciaCursos_cronograma foreign key (idCronograma) references cronogramaCursos
}
