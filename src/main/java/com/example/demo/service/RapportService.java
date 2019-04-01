package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Rapport;

public interface RapportService {
	
	List<Rapport> getAll(String sortby);

    Optional<Rapport> getById(Long id);

    void deleteById(Long id);

    Rapport addOne(Rapport Rapport);

    List<Rapport> getByOffre(Offre offre);
   
    List<Rapport> getByCandidat(Candidat candidat);
    
    List<Rapport> getByRaisonContaining(String raison);
    
    List<Rapport> getByCreatedAt(Date createdAt);
    
    List<Rapport> getByModifiedAt(Date modifiedAt);
}
