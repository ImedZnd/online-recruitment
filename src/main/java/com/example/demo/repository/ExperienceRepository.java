package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cv;
import com.example.demo.model.Entretient;
import com.example.demo.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
	List<Experience> findByCv(Cv cv);
	List<Experience> findByType(String type);
	List<Experience> findByEstablishmentName(String establishmentName);
	List<Experience> findByStart(Date start);
	List<Experience> findByEnd(Date end);
	List<Experience> findByCvId(Long cvId);
	
//	@Query("SELECT * form Experience where  ")
//	List<Cv> findByestablishmentNameAndPeriode( String esname,Date start,Date end);
}
