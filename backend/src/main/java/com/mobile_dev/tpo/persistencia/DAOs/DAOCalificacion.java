package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Calificacion;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryCalificacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOCalificacion {

    RepositoryCalificacion repositoryCalificacion;

    public DAOCalificacion(RepositoryCalificacion repositoryCalificacion) {this.repositoryCalificacion = repositoryCalificacion;}

    public List<Calificacion> findAll(){return repositoryCalificacion.findAll(); }

    public Optional<Calificacion> findById(Long id){return repositoryCalificacion.findById(id);}

    public void save(Calificacion calificacion){repositoryCalificacion.save(calificacion);}

    public void deleteById(Long id){repositoryCalificacion.deleteById(id);}
}