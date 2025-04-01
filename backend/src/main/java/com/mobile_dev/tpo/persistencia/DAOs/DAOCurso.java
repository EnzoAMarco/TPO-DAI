package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.Curso;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryCurso;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOCurso {

    RepositoryCurso repositoryCurso;

    public DAOCurso(RepositoryCurso repositoryCurso) {this.repositoryCurso = repositoryCurso;}

    public List<Curso> findAll(){return repositoryCurso.findAll(); }

    public Optional<Curso> findById(Long id){return repositoryCurso.findById(id);}

    public void save(Curso curso){repositoryCurso.save(curso);}

    public void deleteById(Long id){repositoryCurso.deleteById(id);}
}