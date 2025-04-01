package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCalificacion extends JpaRepository <Calificacion, Long> {
}
