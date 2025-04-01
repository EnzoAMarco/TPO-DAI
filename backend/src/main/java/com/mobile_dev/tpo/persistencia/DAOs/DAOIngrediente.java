package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Ingrediente;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryIngrediente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOIngrediente {

    RepositoryIngrediente repositoryIngrediente;

    public DAOIngrediente(RepositoryIngrediente repositoryIngrediente) {this.repositoryIngrediente = repositoryIngrediente;}

    public List<Ingrediente> findAll(){return repositoryIngrediente.findAll(); }

    public Optional<Ingrediente> findById(Long id){return repositoryIngrediente.findById(id);}

    public void save(Ingrediente ingrediente){repositoryIngrediente.save(ingrediente);}

    public void deleteById(Long id){repositoryIngrediente.deleteById(id);}
}