package com.fr.adaming.demoSpringBoot.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Eleve {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_eleve")
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;

	@ManyToOne
	@JoinColumn (name = "section")
	private Section section;
	
	@ManyToMany
	@JoinTable (name = "convocation",
		joinColumns = @JoinColumn (name = "ideleve", referencedColumnName = "id_eleve"),
		inverseJoinColumns = @JoinColumn (name = "idepreuve", referencedColumnName = "id_epreuve"))
	List <Epreuve> listeEpreuves;
	
	
	
	public Eleve(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public Eleve() {}
	
	
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", section=" + section + ", listeEpreuves=" + listeEpreuves + "]";
	}
	
}
