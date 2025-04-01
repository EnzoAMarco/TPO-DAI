package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySede extends JpaRepository<Sede, Long> {
}
