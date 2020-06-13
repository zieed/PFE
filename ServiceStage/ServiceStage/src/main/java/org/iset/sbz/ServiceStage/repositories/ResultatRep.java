package org.iset.sbz.ServiceStage.repositories;

import java.util.List;

import org.iset.sbz.ServiceStage.models.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatRep extends JpaRepository<Resultat, Integer> {
	List<Resultat> findAll();
}
