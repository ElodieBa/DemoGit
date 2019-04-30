package com.fr.adaming.demoSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demoSpringBoot.entities.Laboratoire;

@Repository
public interface ILaboratoiredao extends JpaRepository <Laboratoire, Long> {

	List <Laboratoire> findByNom(String nom);

}
