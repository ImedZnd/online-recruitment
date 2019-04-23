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

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;
import com.example.demo.service.CompetenceService;
import com.example.demo.service.CvService;

@RestController
@RequestMapping("/com")
@EnableAutoConfiguration
public class CompetenceController {

	@Autowired
	CompetenceService competenceService;
	
	@Autowired
	CvService cvService;
	
	    @GetMapping("/{id}")
	    public ResponseEntity <Optional<Competence>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(competenceService.getById(id), HttpStatus.OK);
	    }
	    @GetMapping("/can/{cv}")
	    public ResponseEntity  <List> getUserById(@PathVariable("id") Cv cv) {
	        return new ResponseEntity<>(competenceService.getByCv(cv), HttpStatus.OK);
	    }
	    @GetMapping("/")
	    public ResponseEntity<List<Competence>> getAll() {
	        List<Competence> list = competenceService.getAll();
	        return new ResponseEntity<List<Competence>>(list, HttpStatus.OK);
	    }
	    @PostMapping("/add")
	    public ResponseEntity<Competence> addCompetence(@RequestBody Competence competence, UriComponentsBuilder builder) {
	        competenceService.addOne(competence);
	        return new ResponseEntity<Competence>(competence, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Competence> updateCompetence(@RequestBody Competence competence) {
	        competenceService.addOne(competence);
	        return new ResponseEntity<Competence>(competence, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deleteCompetence(@RequestBody Competence competence) {
	        competenceService.addOne(competence);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

}
