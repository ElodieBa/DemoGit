package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import com.fr.adaming.demoSpringBoot.entities.Eleve;

public interface IEleveService {

	Eleve findOneById(Long id);
	Eleve save(Eleve e);
	void delete(Eleve e);
	List <Eleve> getAll();
}
