package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Usuario;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryUsuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOUsuario {

    RepositoryUsuario repositoryUsuario;

    public DAOUsuario(RepositoryUsuario repositoryUsuario) {this.repositoryUsuario = repositoryUsuario;}

    public List<Usuario> findAll(){return repositoryUsuario.findAll(); }

    public Optional<Usuario> findById(Long id){return repositoryUsuario.findById(id);}

    public void save(Usuario usuario){repositoryUsuario.save(usuario);}

    public void deleteById(Long id){repositoryUsuario.deleteById(id);}
}

