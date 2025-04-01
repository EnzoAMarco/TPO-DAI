package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUnidad extends JpaRepository<Unidad, Long> {
}
