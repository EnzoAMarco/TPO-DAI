package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Alumno;
import com.mobile_dev.tpo.models.AsistenciaCurso;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryAlumno;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryAsistenciaCurso;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOAsistenciaCurso {

    RepositoryAsistenciaCurso repositoryAsistenciaCurso;

    public DAOAsistenciaCurso(RepositoryAsistenciaCurso repositoryAsistenciaCurso) {
        this.repositoryAsistenciaCurso = repositoryAsistenciaCurso;
    }

    public List<AsistenciaCurso> findAll(){return repositoryAsistenciaCurso.findAll(); }

    public Optional<AsistenciaCurso> findById(Long id){return repositoryAsistenciaCurso.findById(id);}

    public void save(AsistenciaCurso asistenciaCurso){repositoryAsistenciaCurso.save(asistenciaCurso);}

    public void deleteById(Long id){repositoryAsistenciaCurso.deleteById(id);}
}

