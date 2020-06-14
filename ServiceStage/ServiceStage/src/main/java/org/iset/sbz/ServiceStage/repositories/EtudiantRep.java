package org.iset.sbz.ServiceStage.repositories;



import org.iset.sbz.ServiceStage.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EtudiantRep extends JpaRepository<Etudiant, Integer> {

	
	

}
