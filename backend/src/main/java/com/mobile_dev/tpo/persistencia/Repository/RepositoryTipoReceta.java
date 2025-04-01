package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.TipoReceta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTipoReceta extends JpaRepository<TipoReceta, Long> {
}
