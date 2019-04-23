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
import com.example.demo.model.Competence;
import com.example.demo.model.Entretient;
import com.example.demo.service.CandidatService;
import com.example.demo.service.EntretientService;

@RestController
@RequestMapping("/ent")
@EnableAutoConfiguration
public class EntretientController {
	
	@Autowired
	EntretientService entretientService;
	
	@Autowired
	CandidatService candidatService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity <Optional<Entretient>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(entretientService.getById(id), HttpStatus.OK);
	    }
	 @GetMapping("can/{can}")
	    public ResponseEntity <List<Entretient>> getByCandidat(@PathVariable("can") Candidat can) {
	    return new ResponseEntity<>(entretientService.getByCandidat(can), HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<Entretient> addEntretient(@RequestBody Entretient entretient, UriComponentsBuilder builder) {
		 entretientService.addOne(entretient);
	        return new ResponseEntity<Entretient>(entretient, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Entretient> updateEntretient(@RequestBody Entretient entretient) {
	    	entretientService.addOne(entretient);
	        return new ResponseEntity<Entretient>(entretient, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deleteEntretient(@RequestBody Entretient entretient) {
	    	entretientService.addOne(entretient);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

	
}
