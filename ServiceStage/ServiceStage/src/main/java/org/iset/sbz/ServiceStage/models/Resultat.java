package org.iset.sbz.ServiceStage.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.NonNull;

public class Resultat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	private double notef;
	@NonNull
	private String mention;
	@OneToOne
	private Soutenance soutenance;

	public Resultat(Integer id, @NonNull double notef, @NonNull String mention, Soutenance soutenance) {
		super();
		this.id = id;
		this.notef = notef;
		this.mention = mention;
		this.soutenance = soutenance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getNotef() {
		return notef;
	}
	public void setNotef(double notef) {
		this.notef = notef;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public Soutenance getSoutenance() {
		return soutenance;
	}
	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}

}
