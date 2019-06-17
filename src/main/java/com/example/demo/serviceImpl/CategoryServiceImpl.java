package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Offre;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> getById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

	@Override
	public Category addOne(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getByDiscription(String discription) {
		// TODO Auto-generated method stub
		return categoryRepository.findCategoryByDiscription(discription);
	}

	@Override
	public List<Category> getByNumber(int number) {
		// TODO Auto-generated method stub
		return categoryRepository.findCategoryByNumber(number);
	}

	@Override
	public List<Category> getByOffres(Offre offres) {
		// TODO Auto-generated method stub
		return categoryRepository.findCategoryByOffres(offres);
	}

	@Override
	public void deleteCategory(Category cat) {
		// TODO Auto-generated method stub
		 categoryRepository.delete(cat);
	}

}
