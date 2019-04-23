package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Category;
import com.example.demo.model.Client;
import com.example.demo.model.Favorite;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.model.Rapport;
import com.example.demo.status.StatusOffre;

public interface OffreService {

	List<Offre> getAll(String title);

    Optional<Offre> getById(Long id);

    void deleteById(Long id);

    Offre addOne(Offre offre);

    Optional<Offre> getByTitle(String title);
    
    Optional<Offre> getByTitleContaining(String title);
    
    Optional<Offre> getByDescriptionContaining(String discrip);
    
    Optional<Offre> getByDetailsContaining(String detail);
            
    Optional<Offre> getByType(String type);
    
    Optional<Offre> getByStatusOffre(StatusOffre statusOffre);
    
    Optional<Offre> getBySalary(Long salary);
    
    Optional<Offre> getByDateLimit(Date dateLimit);
    
    Optional<Offre> getByCreator(Client creator);
    
    Optional<Offre> getByCreatedAt(Date createdAt);
    
    Optional<Offre> getByExperience(Long experience);
    
    Optional<Offre> getByFavorite(Favorite favorite);
    
    Optional<Offre> getByRapport(Rapport rapport);
    
    Optional<Offre> getByPostulation(Postulation postulation);

	Optional<Offre> getByClient(Client client);

	Optional<Offre> getByCategory(Category category);

	Optional<Offre> getByLocation(Location location);
}
