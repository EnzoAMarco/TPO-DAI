package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Conversion;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryConversion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOConversion {

    RepositoryConversion repositoryConversion;

    public DAOConversion(RepositoryConversion repositoryConversion) {this.repositoryConversion = repositoryConversion;}

    public List<Conversion> findAll(){return repositoryConversion.findAll(); }

    public Optional<Conversion> findById(Long id){return repositoryConversion.findById(id);}

    public void save(Conversion conversion){repositoryConversion.save(conversion);}

    public void deleteById(Long id){repositoryConversion.deleteById(id);}
}
