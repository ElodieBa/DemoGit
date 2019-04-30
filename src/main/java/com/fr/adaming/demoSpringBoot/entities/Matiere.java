package com.fr.adaming.demoSpringBoot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Matiere {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private float duree;
	private float coefficient;
	
	@ManyToOne
	@JoinColumn (name = "section")
	private Section section;
	
	private List <Epreuve> listeEpreuves;

	
	
	public Matiere() {}
	
	public Matiere(String libelle, float duree, float coefficient) {
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
	}

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public float getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
	
	

	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}

	

	public List<Epreuve> getListeEpreuves() {
		return listeEpreuves;
	}
	public void setListeEpreuves(List<Epreuve> listeEpreuves) {
		this.listeEpreuves = listeEpreuves;
	}

	
	
	@Override
	public String toString() {
		return "Matiere [id=" + id + ", libelle=" + libelle + ", duree=" + duree + ", coefficient=" + coefficient
				+ ", section=" + section + ", listeEpreuves=" + listeEpreuves + "]";
	}
	
}
