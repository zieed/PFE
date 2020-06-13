package org.iset.sbz.ServiceStage.repositories;

import org.iset.sbz.ServiceStage.models.Soutenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoutenanceRep extends JpaRepository<Soutenance, Integer> {


}
