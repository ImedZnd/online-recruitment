package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;

public interface PostulationRepository extends JpaRepository<Postulation, Long> {
	List<Postulation> findByOffres(Offre offres);
	List<Postulation> findByModifiedAt(Date modifiedAt);
	List<Postulation> findByCandidats(Candidat candidats);
}
