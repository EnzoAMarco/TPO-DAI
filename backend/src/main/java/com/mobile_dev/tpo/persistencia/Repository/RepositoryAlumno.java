package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAlumno extends JpaRepository<Alumno,Long> {
}
