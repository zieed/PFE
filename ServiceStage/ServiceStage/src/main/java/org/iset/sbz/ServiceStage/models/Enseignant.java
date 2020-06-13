package org.iset.sbz.ServiceStage.models;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.NonNull;

public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	@NonNull
	private String email;
	@NonNull
	private String dep;
	@NonNull
	private String role;
	@OneToMany
	private List<Stage> stage;
	@ManyToMany
	private List<Soutenance> soutenance;
	public Enseignant(Integer id, @NonNull String nom, @NonNull String prenom, @NonNull String email,
			@NonNull String dep, @NonNull String role, List<Stage> stage, List<Soutenance> soutenance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dep = dep;
		this.role = role;
		this.stage = stage;
		this.soutenance = soutenance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Stage> getStage() {
		return stage;
	}
	public void setStage(List<Stage> stage) {
		this.stage = stage;
	}
	public List<Soutenance> getSoutenance() {
		return soutenance;
	}
	public void setSoutenance(List<Soutenance> soutenance) {
		this.soutenance = soutenance;
	}
	
	
		
	

}
