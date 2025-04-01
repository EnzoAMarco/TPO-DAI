package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryReceta extends JpaRepository<Receta, Long> {
}
