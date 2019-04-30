package com.fr.adaming.demoSpringBoot.service;

import java.util.List;

import com.fr.adaming.demoSpringBoot.entities.Section;

public interface ISectionService {

	Section findOneById(Long id);
	Section save(Section s);
	void delete(Section s);
	List <Section> getAll();
}
