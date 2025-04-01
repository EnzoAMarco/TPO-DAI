package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Utilizado;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryUtilizado;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOUtilizado {

    RepositoryUtilizado repositoryUtilizado;

    public DAOUtilizado(RepositoryUtilizado repositoryUtilizado) {this.repositoryUtilizado = repositoryUtilizado;}

    public List<Utilizado> findAll(){return repositoryUtilizado.findAll(); }

    public Optional<Utilizado> findById(Long id){return repositoryUtilizado.findById(id);}

    public void save(Utilizado utilizado){repositoryUtilizado.save(utilizado);}

    public void deleteById(Long id){repositoryUtilizado.deleteById(id);}
}
