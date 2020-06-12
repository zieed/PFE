package org.iset.sbz.ServiceStage.Actors;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.NonNull;

public class Soutenance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private Date date;
	@NonNull
	@OneToOne
	private Resultat resultat;
	
	
	

}