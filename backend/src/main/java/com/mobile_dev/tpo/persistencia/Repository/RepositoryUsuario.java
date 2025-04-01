package com.mobile_dev.tpo.persistencia.Repository;

import com.mobile_dev.tpo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario,Long> {
}
