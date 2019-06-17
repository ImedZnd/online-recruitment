package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Category;
import com.example.demo.model.Offre;

public interface CategoryService {

	List<Category> getAll();

    Optional<Category> getById(Long id);

    void deleteById(Long id);

    Category addOne(Category category);
   
    List<Category> getByNumber(int number);

    List<Category> getByOffres(Offre offres);

	List<Category> getByDiscription(String discription);

	void deleteCategory(Category cat);
}
