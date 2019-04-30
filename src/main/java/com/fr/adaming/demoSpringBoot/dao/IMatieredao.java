package com.fr.adaming.demoSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demoSpringBoot.entities.Matiere;

@Repository
public interface IMatieredao extends JpaRepository <Matiere, Long> {

	List <Matiere> findByLibelle(String libelle);
	
}
