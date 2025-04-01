package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Alumno;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryAlumno;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOAlumno {

    RepositoryAlumno repositoryAlumno;

    public DAOAlumno(RepositoryAlumno repositoryAlumno) {this.repositoryAlumno = repositoryAlumno;}

    public List<Alumno> findAll(){return repositoryAlumno.findAll(); }

    public Optional<Alumno> findById(Long id){return repositoryAlumno.findById(id);}

    public void save(Alumno alumno){repositoryAlumno.save(alumno);}

    public void deleteById(Long id){repositoryAlumno.deleteById(id);}
}
