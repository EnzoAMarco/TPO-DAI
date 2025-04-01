package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Paso;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryPaso;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOPaso {

    RepositoryPaso repositoryPaso;

    public DAOPaso(RepositoryPaso repositoryPaso) {this.repositoryPaso = repositoryPaso;}

    public List<Paso> findAll(){return repositoryPaso.findAll(); }

    public Optional<Paso> findById(Long id){return repositoryPaso.findById(id);}

    public void save(Paso paso){repositoryPaso.save(paso);}

    public void deleteById(Long id){repositoryPaso.deleteById(id);}
}

