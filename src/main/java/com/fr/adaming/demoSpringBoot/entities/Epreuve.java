package com.fr.adaming.demoSpringBoot.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_epreuve")
	private Long id;
	private Date dateHeure;

	@ManyToOne
	@JoinColumn (name = "matiere")
	private Matiere matiere;

	@ManyToOne
	@JoinColumn (name = "laboratoire")
	private Laboratoire laboratoire;
	
	@ManyToMany (mappedBy = "listeEpreuves")
	List <Eleve> listEleves;
	
	
	
	public Epreuve() {}
	
	public Epreuve(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateHeure() {
		return dateHeure;
	}
	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

		
	
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}
	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}
	
	
	
	public List<Eleve> getListEleves() {
		return listEleves;
	}
	public void setListEleves(List<Eleve> listEleves) {
		this.listEleves = listEleves;
	}

	
	
	@Override
	public String toString() {
		return "Epreuve [id=" + id + ", dateHeure=" + dateHeure + ", matiere=" + matiere + ", laboratoire="
				+ laboratoire + ", listEleves=" + listEleves + "]";
	}

}
