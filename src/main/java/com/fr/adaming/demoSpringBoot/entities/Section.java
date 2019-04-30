package com.fr.adaming.demoSpringBoot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	
	@OneToMany (mappedBy = "section", cascade = CascadeType.ALL)
	private List <Eleve> listeEleves;
	
	@OneToMany (mappedBy = "section", cascade = CascadeType.ALL)
	private List <Matiere> listeMatieres;

	
	
	public Section(String libelle) {
		this.libelle = libelle;
	}

	public Section() {}
	
		

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
	
	
	
	public List<Eleve> getListeEleves() {
		return listeEleves;
	}
	public void setListeEleves(List<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}

	

	public List<Matiere> getListeMatieres() {
		return listeMatieres;
	}
	public void setListeMatieres(List<Matiere> listeMatieres) {
		this.listeMatieres = listeMatieres;
	}

	
	
	@Override
	public String toString() {
		return "Section [id=" + id + ", libelle=" + libelle + ", listeEleves=" + listeEleves + ", listeMatieres="
				+ listeMatieres + "]";
	}

}
