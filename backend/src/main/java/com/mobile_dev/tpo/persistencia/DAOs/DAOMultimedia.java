package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Multimedia;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryMultimedia;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOMultimedia {

    RepositoryMultimedia repositoryMultimedia;

    public DAOMultimedia(RepositoryMultimedia repositoryMultimedia) {this.repositoryMultimedia = repositoryMultimedia;}

    public List<Multimedia> findAll(){return repositoryMultimedia.findAll(); }

    public Optional<Multimedia> findById(Long id){return repositoryMultimedia.findById(id);}

    public void save(Multimedia multimedia){repositoryMultimedia.save(multimedia);}

    public void deleteById(Long id){repositoryMultimedia.deleteById(id);}
}
