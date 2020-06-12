package org.iset.sbz.ServiceStage.Actors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.NonNull;

@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private Type typ;
	@NonNull
	private String sujet;
	@NonNull
	private String place;
	
	@NonNull
	@OneToMany
	private Etudiant etudiant;
	@NonNull
	@OneToMany
	private Soutenance soutenance;
	
	

}
