package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.TipoReceta;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryTipoReceta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOTipoReceta {

    RepositoryTipoReceta repositoryTipoReceta;

    public DAOTipoReceta(RepositoryTipoReceta repositoryTipoReceta) {this.repositoryTipoReceta = repositoryTipoReceta;}

    public List<TipoReceta> findAll(){return repositoryTipoReceta.findAll(); }

    public Optional<TipoReceta> findById(Long id){return repositoryTipoReceta.findById(id);}

    public void save(TipoReceta tipoReceta){repositoryTipoReceta.save(tipoReceta);}

    public void deleteById(Long id){repositoryTipoReceta.deleteById(id);}
}