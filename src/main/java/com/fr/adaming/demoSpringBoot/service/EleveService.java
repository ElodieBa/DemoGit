package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.demoSpringBoot.dao.IElevedao;
import com.fr.adaming.demoSpringBoot.entities.Eleve;

@Service
public class EleveService implements IEleveService {

	@Autowired
	private IElevedao elevedao;
	
	
	
	@Override
	public Eleve findOneById(Long id) {
	
		return elevedao.getOne(id);
	}

	@Override
	public Eleve save(Eleve e) {
		
		return elevedao.save(e);
	}

	@Override
	public void delete(Eleve e) {
		
		elevedao.delete(e);		
	}

	@Override
	public List <Eleve> getAll() {
	
		return elevedao.findAll();
	}

}
