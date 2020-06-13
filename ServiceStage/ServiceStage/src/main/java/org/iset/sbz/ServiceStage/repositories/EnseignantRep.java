package org.iset.sbz.ServiceStage.repositories;

import java.util.List;

import org.iset.sbz.ServiceStage.models.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnseignantRep extends JpaRepository<Enseignant, Integer> {

 List<Enseignant> findAll();
}
