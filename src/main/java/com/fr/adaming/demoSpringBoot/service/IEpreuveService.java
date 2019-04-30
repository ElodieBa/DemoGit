package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import com.fr.adaming.demoSpringBoot.entities.Epreuve;

public interface IEpreuveService {

	Epreuve save(Epreuve e);
	void delete(Epreuve e);
	List <Epreuve> getAll();
}
