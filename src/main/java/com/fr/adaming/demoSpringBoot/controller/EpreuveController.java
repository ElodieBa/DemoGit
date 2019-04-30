package com.fr.adaming.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demoSpringBoot.entities.Epreuve;
import com.fr.adaming.demoSpringBoot.service.IEpreuveService;


@RestController
public class EpreuveController {
	
	
	@Autowired
	private IEpreuveService epreuvedao;
	
	

	@PostMapping("/api/save")
	public Epreuve save(@RequestBody Epreuve e) {
		return epreuvedao.save(e);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Epreuve e) {
		epreuvedao.delete(e);
	}

	@GetMapping("/api/getall")
	public List <Epreuve> getAll() {
		return epreuvedao.getAll();
	}


}
