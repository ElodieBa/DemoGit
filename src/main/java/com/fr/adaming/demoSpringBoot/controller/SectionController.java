package com.fr.adaming.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demoSpringBoot.entities.Section;
import com.fr.adaming.demoSpringBoot.service.ISectionService;


@RestController
public class SectionController {
	
	
	@Autowired
	private ISectionService sectiondao;
	
	@GetMapping("/api/get/{id}")
	public Section findOneById(@PathVariable Long id) {
		return sectiondao.findOneById(id);
	}

	@PostMapping("/api/save")
	public Section save(@RequestBody Section s) {
		return sectiondao.save(s);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Section s) {
		sectiondao.delete(s);
	}

	@GetMapping("/api/getall")
	public List <Section> getAll() {
		return sectiondao.getAll();
	}


}
