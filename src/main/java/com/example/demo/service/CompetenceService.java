package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;

public interface CompetenceService {
	
	List<Competence> getAll(String sortby);

    Optional<Competence> getById(Long id);

    void deleteById(Long id);

    Competence addOne(Competence competence);

    List<Competence> getByName(String name);
   
    List<Competence> getByLevel(String level);

    List<Competence> getByMonthOfExp(String monthOfExp);
    
    List<Competence> getByCv(Cv cv);
    
}
