package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {


	Responsable findResponsableById(Long id);
	List<Responsable> findResponsableByName(String name);
	List<Responsable> findResponsableBySurename(String surename);
    List<Responsable> findResponsableByRole(Enum role);
    List<Responsable> findResponsableByStatus(String status);
	List<Responsable> findAll();
}
