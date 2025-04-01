package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Foto;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFoto extends JpaRepository<Foto, Long> {
}
