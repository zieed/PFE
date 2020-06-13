package org.iset.sbz.ServiceStage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name="Stage")
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	private String type;
	@NonNull
	private String sujet;
	@NonNull
	private String place;
	
	@NonNull
	@ManyToOne
	
	private Etudiant etudiant;
	@ManyToOne
	private Enseignant encadreur;
	
	
	public Stage(Integer id, @NonNull String type, @NonNull String sujet, @NonNull String place,
			@NonNull Etudiant etudiant, Enseignant encadreur, Soutenance soutenance) {
		super();
		this.id = id;
		this.type = type;
		this.sujet = sujet;
		this.place = place;
		this.etudiant = etudiant;
		this.encadreur = encadreur;
		this.soutenance = soutenance;
	}

	public Enseignant getEncadreur() {
		return encadreur;
	}

	public void setEncadreur(Enseignant encadreur) {
		this.encadreur = encadreur;
	}

	@OneToOne
	private Soutenance soutenance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setTyp(String type) {
		this.type = type;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Soutenance getSoutenance() {
		return soutenance;
	}

	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}	
	

}
