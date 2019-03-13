package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;

public interface CandidatService {

   	 List<Candidat> getAll(String sortby);

	    Optional<Candidat> getById(Long id);

	    void deleteById(Long id);

	    Candidat addOne(Candidat Candidat);

	    List<Candidat> getByName(String name);
	   
	    List<Candidat> getBySexe(String sexe);

	    List<Candidat> getBySurename(String surename);
}
