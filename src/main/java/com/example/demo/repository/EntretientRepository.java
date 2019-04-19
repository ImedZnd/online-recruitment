package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidat;
import com.example.demo.model.Entretient;

@Repository
public interface EntretientRepository extends JpaRepository<Entretient, Long> {
	
	List<Entretient> findByCompteRenduContaining(String compteRendu);
	List<Entretient> findEntretientByType(String type);
	List<Entretient> findEntretientByCandidat(Candidat candidat);
	List<Entretient> findEntretientByCreatedAt(Date createdAt);
	List<Entretient> findEntretientByModifiedAt(Date modifiedAt);
}
