package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyectos, Long >{}

