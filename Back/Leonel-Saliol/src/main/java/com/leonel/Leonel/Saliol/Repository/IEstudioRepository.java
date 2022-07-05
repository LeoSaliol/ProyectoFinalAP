package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository<Estudio, Long> {


}
