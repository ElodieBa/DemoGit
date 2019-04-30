package com.fr.adaming.demoSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demoSpringBoot.entities.Eleve;

@Repository
public interface IElevedao extends JpaRepository <Eleve, Long> {

	List<Eleve> findByNom(String nom);
	List<Eleve> findByPrenom(String prenom);
	
}
