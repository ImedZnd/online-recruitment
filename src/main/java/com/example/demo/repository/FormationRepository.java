package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cv;
import com.example.demo.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
	List<Formation> findByGrade(Date grade);
	List<Formation> findByEstablishmentNameContaining(String establishmentName);
	List<Formation> findByCreatedAt(Date createdAt);
	List<Formation> findByCv(Cv cv);
	
}
