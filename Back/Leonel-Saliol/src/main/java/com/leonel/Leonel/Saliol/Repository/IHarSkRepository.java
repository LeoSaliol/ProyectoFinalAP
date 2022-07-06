package com.leonel.Leonel.Saliol.Repository;

import com.leonel.Leonel.Saliol.Entity.HarSk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHarSkRepository extends JpaRepository<HarSk, Long> {
}
