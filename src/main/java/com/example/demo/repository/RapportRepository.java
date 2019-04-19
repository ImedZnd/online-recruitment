package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Rapport;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long> {
	List<Rapport> findByOffre(Offre offre);
	List<Rapport> findByModifiedAt(Date modifiedAt);
	List<Rapport> findByCreatedAt(Date createdAt);
	List<Rapport> findByRaisonContaining(String raison);
	List<Rapport> findByCandidat(Candidat candidat);
}
