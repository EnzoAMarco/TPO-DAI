package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Foto;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryFoto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOFoto {

    RepositoryFoto repositoryFoto;

    public DAOFoto(RepositoryFoto repositoryFoto) {this.repositoryFoto = repositoryFoto;}

    public List<Foto> findAll(){return repositoryFoto.findAll(); }

    public Optional<Foto> findById(Long id){return repositoryFoto.findById(id);}

    public void save(Foto foto){repositoryFoto.save(foto);}

    public void deleteById(Long id){repositoryFoto.deleteById(id);}
}
