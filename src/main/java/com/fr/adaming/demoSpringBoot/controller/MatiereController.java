package com.fr.adaming.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demoSpringBoot.entities.Matiere;
import com.fr.adaming.demoSpringBoot.service.IMatiereService;

@RestController
public class MatiereController {
	
	
	@Autowired
	private IMatiereService matieredao;
	
	@GetMapping("/api/get/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		return matieredao.findOneById(id);
	}

	@PostMapping("/api/save")
	public Matiere save(@RequestBody Matiere m) {
		return matieredao.save(m);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Matiere m) {
		matieredao.delete(m);
	}

	@GetMapping("/api/getall")
	public List <Matiere> getAll() {
		return matieredao.getAll();
	}


}
