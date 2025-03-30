package com.mobile_dev.tpo.models;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;


public class CronogramaCurso {
    private int idcronograma;
    private int idsede;
    private int idcurso;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private int vacantesdisponibles;
    //constraint fk_cronogramaCursos_sedes foreign key (idSede) references sedes,
    //constraint fk_cronogramaCursos_cursos foreign key (idCurso) references cursos
}
