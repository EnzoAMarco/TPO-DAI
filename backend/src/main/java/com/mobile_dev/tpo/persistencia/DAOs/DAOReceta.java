package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Receta;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryReceta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOReceta {

    RepositoryReceta repositoryReceta;

    public DAOReceta(RepositoryReceta repositoryReceta) {this.repositoryReceta = repositoryReceta;}

    public List<Receta> findAll(){return repositoryReceta.findAll(); }

    public Optional<Receta> findById(Long id){return repositoryReceta.findById(id);}

    public void save(Receta receta){repositoryReceta.save(receta);}

    public void deleteById(Long id){repositoryReceta.deleteById(id);}
}