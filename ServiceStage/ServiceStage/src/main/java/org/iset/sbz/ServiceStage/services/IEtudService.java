package org.iset.sbz.ServiceStage.services;



import org.iset.sbz.ServiceStage.models.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEtudService {
	public Page<Etudiant> findAll(Pageable page);

}
