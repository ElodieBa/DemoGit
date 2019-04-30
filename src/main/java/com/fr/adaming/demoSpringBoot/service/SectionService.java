package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.demoSpringBoot.dao.ISectiondao;
import com.fr.adaming.demoSpringBoot.entities.Section;

@Service
public class SectionService implements ISectionService {

	@Autowired
	private ISectiondao sectiondao;
	
	
	
	@Override
	public Section findOneById(Long id) {
	
		return sectiondao.getOne(id);
	}

	@Override
	public Section save(Section s) {
		
		return sectiondao.save(s);
	}

	@Override
	public void delete(Section s) {

		sectiondao.delete(s);
	}

	@Override
	public List <Section> getAll() {
		
		return sectiondao.findAll();
	}

}
