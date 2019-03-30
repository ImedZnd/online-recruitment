package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Entretient;

public interface EntretientRepository extends JpaRepository<Entretient, Long> {
	
	List<Entretient> findByCompteRenduContaining(String compteRendu);
}
