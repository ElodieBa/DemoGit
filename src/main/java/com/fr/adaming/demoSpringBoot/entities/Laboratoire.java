package com.fr.adaming.demoSpringBoot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int nbOrdinateurs;
	
	@OneToMany (mappedBy = "laboratoire", cascade = CascadeType.ALL)
	private List <Epreuve> listeEpreuves;
	
	
	
	public Laboratoire() {}
	
	public Laboratoire(String nom, int nbOrdinateurs) {
		this.nom = nom;
		this.nbOrdinateurs = nbOrdinateurs;
	}
	
	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbOrdinateurs() {
		return nbOrdinateurs;
	}
	public void setNbOrdinateurs(int nbOrdinateurs) {
		this.nbOrdinateurs = nbOrdinateurs;
	}

		
	
	public List<Epreuve> getListeEpreuves() {
		return listeEpreuves;
	}
	public void setListeEpreuves(List<Epreuve> listeEpreuves) {
		this.listeEpreuves = listeEpreuves;
	}

	
	
	@Override
	public String toString() {
		return "Laboratoire [id=" + id + ", nom=" + nom + ", nbOrdinateurs=" + nbOrdinateurs + ", listeEpreuves="
				+ listeEpreuves + "]";
	}

}
