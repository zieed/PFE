package org.iset.sbz.ServiceStage.repositories;

import org.iset.sbz.ServiceStage.Actors.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRep extends JpaRepository<Stage, Integer>{

}
