package com.portfolio.LeonelSaliol.Repository;

import com.portfolio.LeonelSaliol.Entity.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer> {
}
