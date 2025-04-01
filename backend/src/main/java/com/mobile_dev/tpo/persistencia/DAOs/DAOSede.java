package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Sede;
import com.mobile_dev.tpo.persistencia.Repository.RepositorySede;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOSede {

    RepositorySede repositorySede;

    public DAOSede(RepositorySede repositorySede) {this.repositorySede = repositorySede;}

    public List<Sede> findAll(){return repositorySede.findAll(); }

    public Optional<Sede> findById(Long id){return repositorySede.findById(id);}

    public void save(Sede sede){repositorySede.save(sede);}

    public void deleteById(Long id){repositorySede.deleteById(id);}
}