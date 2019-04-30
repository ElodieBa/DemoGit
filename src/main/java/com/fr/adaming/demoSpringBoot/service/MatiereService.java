package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.demoSpringBoot.dao.IMatieredao;
import com.fr.adaming.demoSpringBoot.entities.Matiere;

@Service
public class MatiereService implements IMatiereService {

	@Autowired
	private IMatieredao matieredao;
	
	
	
	@Override
	public Matiere findOneById(Long id) {
	
		return matieredao.getOne(id);
	}

	@Override
	public Matiere save(Matiere m) {
		
		return matieredao.save(m);
	}

	@Override
	public void delete(Matiere m) {

		matieredao.delete(m);
	}

	@Override
	public List <Matiere> getAll() {
		
		return matieredao.findAll();
	}
}
