package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Postulation;

public interface PostulationRepository extends JpaRepository<Postulation, Long> {

}
