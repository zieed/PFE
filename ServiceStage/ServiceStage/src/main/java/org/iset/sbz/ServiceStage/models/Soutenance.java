package org.iset.sbz.ServiceStage.models;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.NonNull;
@Entity
@Table(name = "Soutenance")
public class Soutenance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private String date;
	@NonNull
	@OneToOne
	private Resultat resultat;
	@OneToOne
	private Stage stage;
	@ManyToMany
	private List<Enseignant> jury;


	public Soutenance(Integer id, @NonNull String date, @NonNull Resultat resultat, Stage stage, List<Enseignant> jury) {
		super();
		this.id = id;
		this.date = date;
		this.resultat = resultat;
		this.stage = stage;
		this.jury = jury;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Resultat getResultat() {
		return resultat;
	}
	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public List<Enseignant> getJury() {
		return jury;
	}
	public void setJury(List<Enseignant> jury) {
		this.jury = jury;
	}
	
	
	

}
