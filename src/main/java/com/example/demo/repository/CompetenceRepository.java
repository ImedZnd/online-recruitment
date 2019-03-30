package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {
	List<Competence> findCompetenceByName(String name);
	List<Competence> findCompetenceByLevel(String level);
	List<Competence> findCompetenceByMonthOfExp(String MonthOfExp);
	List<Competence> findCompetenceByCv(Cv cv);
}
