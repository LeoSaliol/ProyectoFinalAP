
package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepo extends JpaRepository<Persona, Long> {
    
}
