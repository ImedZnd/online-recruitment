package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Candidat;


@Repository
public interface CandidatRepository extends JpaRepository<Candidat,Long>{
	
	Candidat findCandidatById(Long id);
	List<Candidat> findCandidatByName(String name);
    List<Candidat> findCandidatBySurename(String surename);
    List<Candidat> findCandidatBySexe(String sexe);
    List<Candidat> findCandidatByStatus(Enum<?> status);
	List<Candidat> findAll();
}
