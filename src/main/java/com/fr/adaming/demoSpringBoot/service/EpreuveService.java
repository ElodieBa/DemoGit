package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.demoSpringBoot.dao.IEpreuvedao;
import com.fr.adaming.demoSpringBoot.entities.Epreuve;

@Service
public class EpreuveService implements IEpreuveService {

	@Autowired
	private IEpreuvedao epreuvedao;

	@Override
	public Epreuve save(Epreuve e) {
	
		return epreuvedao.save(e);
	}

	@Override
	public void delete(Epreuve e) {
		
		epreuvedao.delete(e);
	}

	@Override
	public List <Epreuve> getAll() {
		
		return epreuvedao.findAll();
	}

}
