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

import com.example.demo.model.Candidat;
import com.example.demo.model.Cv;
import com.example.demo.model.Formation;
import com.example.demo.model.Postulation;
import com.example.demo.service.FormationService;
import com.example.demo.service.PostulationService;

@RestController
@RequestMapping("/pos")
@EnableAutoConfiguration
public class PostulationController {
	
	@Autowired
	PostulationService postulationService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity <Optional<Postulation>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(postulationService.getById(id), HttpStatus.OK);
	    }
	 @GetMapping("can/{can}")
	    public ResponseEntity <List<Postulation>> getByCan(@PathVariable("can") Candidat candidat) {
	    return new ResponseEntity<>(postulationService.getByCandidats(candidat), HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<Postulation> addPostulation(@RequestBody Postulation postulation, UriComponentsBuilder builder) {
		 postulationService.addOne(postulation);
	        return new ResponseEntity<Postulation>(postulation, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Postulation> updatePostulation(@RequestBody Postulation postulation) {
	    	postulationService.addOne(postulation);
	        return new ResponseEntity<Postulation>(postulation, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deletePostulation(@RequestBody Postulation postulation) {
	    	postulationService.addOne(postulation);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

}
