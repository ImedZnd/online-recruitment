package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Location;
import com.example.demo.model.Offre;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	List<Location> findByOffres(Offre offre);
	List<Location> findByDiscription(String discription);
	List<Location> findByNumber(int number);
}
