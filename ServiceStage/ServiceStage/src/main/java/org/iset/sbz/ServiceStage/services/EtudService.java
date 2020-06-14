package org.iset.sbz.ServiceStage.services;

import org.iset.sbz.ServiceStage.models.Etudiant;
import org.iset.sbz.ServiceStage.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EtudService implements IEtudService{
	@Autowired
	private EtudiantRep etudiantRep;
	@Override
	public Page<Etudiant> findAll(Pageable page) {
		
		return etudiantRep.findAll(page);
	}

}
