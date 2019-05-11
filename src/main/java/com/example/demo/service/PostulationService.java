package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;

public interface PostulationService {
	List<Postulation> getAll(String sortby);

    Optional<Postulation> getById(Long id);

    void deleteById(Long id);

    Postulation addOne(Postulation location);

    List<Postulation> getByOffres(Offre offres);
   
    List<Postulation> getByCandidats(Candidat candidats);
    
    List<Postulation> getByModifiedAt(Date modifiedAt);

	List<Postulation> getByCandidatsId(Long canId);

	List<Postulation> getByOffresId(Long offId);
}
