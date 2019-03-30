package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Entretient;

public interface EntretientService {
	
	List<Entretient> getAll(String sortby);

    Optional<Entretient> getById(Long id);

    void deleteById(Long id);

    Entretient addOne(Entretient Candidat);

    List<Entretient> getByType(String type);
   
    List<Entretient> getByCompteRenduContain(String compteRendu);

    List<Entretient> getByCandidat(Candidat candidat);
    
    List<Entretient> getByCreatedAt(Date createdAt);
    
    List<Entretient> getByModifiedAt(Date modifiedAt);
}
