// DAOUnidad.java
package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Unidad;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryUnidad;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOUnidad {

    RepositoryUnidad repositoryUnidad;

    public DAOUnidad(RepositoryUnidad repositoryUnidad) {this.repositoryUnidad = repositoryUnidad;}

    public List<Unidad> findAll(){return repositoryUnidad.findAll(); }

    public Optional<Unidad> findById(Long id){return repositoryUnidad.findById(id);}

    public void save(Unidad unidad){repositoryUnidad.save(unidad);}

    public void deleteById(Long id){repositoryUnidad.deleteById(id);}
}