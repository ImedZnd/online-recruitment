package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidat;
import com.example.demo.model.Favorite;
import com.example.demo.model.Offre;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
	List<Favorite> findByOffres(Offre offre);
	List<Favorite> findByCandidat(Candidat candidat);
	
}
