package com.fr.adaming.demoSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demoSpringBoot.entities.Section;

@Repository
public interface ISectiondao extends JpaRepository <Section, Long> {

	List <Section> findByLibelle(String libelle);
	
}
