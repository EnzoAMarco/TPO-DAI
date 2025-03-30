package com.mobile_dev.tpo.Repository;
import com.mobile_dev.tpo.models.ModelEjemplo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEjemplo extends JpaRepository<ModelEjemplo, Long> {

}
