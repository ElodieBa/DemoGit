package com.fr.adaming.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demoSpringBoot.entities.Laboratoire;
import com.fr.adaming.demoSpringBoot.service.ILaboratoireService;

@RestController
public class LaboratoireController {
	
	
	@Autowired
	private ILaboratoireService laboratoiredao;
	
	@GetMapping("/api/get/{id}")
	public Laboratoire findOneById(@PathVariable Long id) {
		return laboratoiredao.findOneById(id);
	}

	@PostMapping("/api/save")
	public Laboratoire save(@RequestBody Laboratoire l) {
		return laboratoiredao.save(l);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Laboratoire l) {
		laboratoiredao.delete(l);
	}

	@GetMapping("/api/getall")
	public List <Laboratoire> getAll() {
		return laboratoiredao.getAll();
	}
}
