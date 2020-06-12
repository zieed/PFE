package org.iset.sbz.ServiceStage.repositories;

import org.iset.sbz.ServiceStage.Actors.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatRep extends JpaRepository<Resultat, Integer> {

}
