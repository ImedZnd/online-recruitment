package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Favorite;
import com.example.demo.model.Offre;

public interface FavoriteService {

	List<Favorite> getAll(String sortby);

    Optional<Favorite> getById(Long id);

    void deleteById(Long id);

    Favorite addOne(Favorite favorite);

    List<Favorite> getByOffres(Offre offres);
   
    List<Favorite> getByCandidat(Candidat candidat);
    
}
