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
import com.example.demo.model.Client;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.model.Rapport;
import com.example.demo.service.PostulationService;
import com.example.demo.service.RapportService;

@RestController
@RequestMapping("/rap")
@EnableAutoConfiguration
public class RapportController {

	@Autowired
	RapportService rapportService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity <Optional<Rapport>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(rapportService.getById(id), HttpStatus.OK);
	    }
	 @GetMapping("can/{canId}")
	    public ResponseEntity <List<Rapport>> getByCan(@PathVariable("canId") Long canId) {
	    return new ResponseEntity<>(rapportService.getByCandidatId(canId), HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<Rapport> addRapport(@RequestBody Rapport rapport, UriComponentsBuilder builder) {
		 rapportService.addOne(rapport);
	        return new ResponseEntity<Rapport>(rapport, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Rapport> updateRapport(@RequestBody Rapport rapport) {
	    	rapportService.addOne(rapport);
	        return new ResponseEntity<Rapport>(rapport, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deleteRapport(@RequestBody Rapport rapport) {
	    	rapportService.addOne(rapport);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

}
