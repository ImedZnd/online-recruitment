package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidat;
import com.example.demo.model.Category;
import com.example.demo.model.Offre;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	List<Category> findCategoryByDiscription(String discription);
	List<Category> findCategoryByNumber(int number);
	List<Category> findCategoryByOffres(Offre offres);
}
