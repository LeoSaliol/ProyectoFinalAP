package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {



}
