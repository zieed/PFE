package org.iset.sbz.ServiceStage.Actors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NonNull;

public class Resultat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private long notef;
	@NonNull
	private String mention;

}