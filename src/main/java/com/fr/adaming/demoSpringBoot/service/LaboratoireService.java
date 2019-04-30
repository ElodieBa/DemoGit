package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.demoSpringBoot.dao.ILaboratoiredao;
import com.fr.adaming.demoSpringBoot.entities.Laboratoire;

@Service
public class LaboratoireService implements ILaboratoireService {

	@Autowired
	private ILaboratoiredao laboratoiredao;
	
	
	
	@Override
	public Laboratoire findOneById(Long id) {
	
		return laboratoiredao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire l) {
		
		return laboratoiredao.save(l);
	}

	@Override
	public void delete(Laboratoire l) {

		laboratoiredao.delete(l);
	}

	@Override
	public List <Laboratoire> getAll() {
		
		return laboratoiredao.findAll();
	}

}
