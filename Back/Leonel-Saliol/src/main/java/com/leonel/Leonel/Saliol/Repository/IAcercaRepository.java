package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface IAcercaRepository extends JpaRepository<Acerca,Long> {


}
