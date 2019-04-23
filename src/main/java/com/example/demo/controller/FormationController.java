package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Formation;
import com.example.demo.service.FormationService;

@RestController
@RequestMapping("/for")
@EnableAutoConfiguration
public class FormationController {
	
	@Autowired
	FormationService formationService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity <Optional<Formation>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(formationService.getById(id), HttpStatus.OK);
	    }
	 @GetMapping("cv/{cv}")
	    public ResponseEntity <List<Formation>> getByCv(@PathVariable("cv") Cv cv) {
	    return new ResponseEntity<>(formationService.getByCv(cv), HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<Formation> addFormation(@RequestBody Formation formation, UriComponentsBuilder builder) {
		 formationService.addOne(formation);
	        return new ResponseEntity<Formation>(formation, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Formation> updateFormation(@RequestBody Formation formation) {
	    	formationService.addOne(formation);
	        return new ResponseEntity<Formation>(formation, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deleteFormation(@RequestBody Formation formation) {
	    	formationService.addOne(formation);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

}
