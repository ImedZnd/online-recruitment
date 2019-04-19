package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {
	List<Competence> findCompetenceByName(String name);
	List<Competence> findCompetenceByLevel(String level);
	List<Competence> findCompetenceByMonthOfExp(String MonthOfExp);
	List<Competence> findCompetenceByCv(Cv cv);
}
