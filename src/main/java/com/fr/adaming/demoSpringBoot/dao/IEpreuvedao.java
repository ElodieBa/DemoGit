package com.fr.adaming.demoSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demoSpringBoot.entities.Epreuve;

@Repository
public interface IEpreuvedao extends JpaRepository <Epreuve, Long> {

}
