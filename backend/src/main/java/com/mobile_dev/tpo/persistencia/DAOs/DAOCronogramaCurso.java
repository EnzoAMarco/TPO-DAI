package com.mobile_dev.tpo.persistencia.DAOs;

import com.mobile_dev.tpo.models.CronogramaCurso;
import com.mobile_dev.tpo.persistencia.Repository.RepositoryCronogramaCurso;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DAOCronogramaCurso {

    RepositoryCronogramaCurso repositoryCronogramaCurso;

    public DAOCronogramaCurso(RepositoryCronogramaCurso repositoryCronogramaCurso) {this.repositoryCronogramaCurso = repositoryCronogramaCurso;}

    public List<CronogramaCurso> findAll(){return repositoryCronogramaCurso.findAll(); }

    public Optional<CronogramaCurso> findById(Long id){return repositoryCronogramaCurso.findById(id);}

    public void save(CronogramaCurso cronogramaCurso){repositoryCronogramaCurso.save(cronogramaCurso);}

    public void deleteById(Long id){repositoryCronogramaCurso.deleteById(id);}
}
