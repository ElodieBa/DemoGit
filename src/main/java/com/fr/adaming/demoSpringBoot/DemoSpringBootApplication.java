package com.fr.adaming.demoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.demoSpringBoot.dao.IElevedao;
import com.fr.adaming.demoSpringBoot.entities.Eleve;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
		
		IElevedao edao = ctx.getBean(com.fr.adaming.demoSpringBoot.dao.IElevedao.class);
		Eleve e = new Eleve("Baudu", "Elodie", null);
		edao.save(e);
		
	}

}
