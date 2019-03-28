package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Rapport;

public interface RapportRepository extends JpaRepository<Rapport, Long> {

}
