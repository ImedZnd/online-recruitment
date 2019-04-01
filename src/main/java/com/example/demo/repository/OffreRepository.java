package com.example.demo.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;
import com.example.demo.model.Offre;
import com.example.demo.status.StatusOffre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

	Optional<Offre> findByTitle(String title);
	Optional<Offre> findByPlace(String place);
	Optional<Offre> findByType(String type);
	Optional<Offre> findByStatusOffre(StatusOffre statusOffre);
	Optional<Offre> findBySalary(Long salary);
	Optional<Offre> findByDateLimit(Date dateLimit);
	Optional<Offre> findByCreatedAt(Date createdAt);
	Optional<Offre> findByExperience(Long experience);

}
