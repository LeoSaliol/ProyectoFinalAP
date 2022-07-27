package com.portfolio.LeonelSaliol.Repository;

import com.portfolio.LeonelSaliol.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface REstudio extends JpaRepository<Estudio, Integer> {

    public Optional<Estudio> findByNombreEs(String nombreEs);

    public boolean existsByNombreEs(String nombreEs);


}
