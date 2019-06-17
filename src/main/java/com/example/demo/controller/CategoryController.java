package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Candidat;
import com.example.demo.model.Category;
import com.example.demo.model.Offre;
import com.example.demo.service.CategoryService;
import com.example.demo.service.OffreService;

@RestController
@RequestMapping("/cat")
@EnableAutoConfiguration
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	@Autowired
	OffreService offreService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    public ResponseEntity<List<Category>> getAllCategory( ) {
	return new ResponseEntity<>(categoryService.getAll(),HttpStatus.OK); 		
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/off/{offId}")
    public ResponseEntity<Optional<Offre>> getOffreCategory(@PathVariable(value = "offId") Long offId ) {
	return new ResponseEntity<>(offreService.getByCategoryId(offId),HttpStatus.OK); 		
    }
	
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Category>> getcategorybyId( @PathVariable(value = "id") Long id) {
        System.out.println("get Category with id\n");
            return new ResponseEntity<>(
            		categoryService.getById(id),
            		HttpStatus.OK
            		);
    }
	   @CrossOrigin(origins = "*")
	    @PostMapping("/add")
	    public ResponseEntity<Category> addCategory(@Valid @RequestBody Category category) {
	            System.out.println("add a Category \n");
	            return new ResponseEntity<>(categoryService.addOne(category),HttpStatus.OK);
	    }
	    @CrossOrigin(origins = "*")
	    @DeleteMapping("/delete/id/{id}")
	    public ResponseEntity deleteCategoryById(@PathVariable ("id") Long id) {
	            System.out.println("delete a Category \n");
	            if (categoryService.getById(id) != null) {
	            	categoryService.deleteById(id);
	                return new ResponseEntity<>( HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }
	    }
	    @CrossOrigin(origins = "*")
	    @DeleteMapping("/delete/{cat}")
	    public ResponseEntity deleteCategory(@RequestBody Category cat) {
	            System.out.println("delete a Category \n");
	            categoryService.deleteCategory(cat);
	            return new ResponseEntity<>(HttpStatus.OK);
	    }
	    @CrossOrigin(origins = "*")
	    @PutMapping("/update")
	    public ResponseEntity<Category> updateCategory( @RequestBody Category newCategory)  {
	            System.out.println("update Category \n");
	            Optional<Category> oldCategory = getcategorybyId(newCategory.getId()).getBody();
	            if (oldCategory.isPresent()) {
	                return new ResponseEntity<>(addCategory(newCategory).getBody(), HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }
	    }
}
