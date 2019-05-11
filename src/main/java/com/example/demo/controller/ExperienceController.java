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
import com.example.demo.model.Entretient;
import com.example.demo.model.Experience;
import com.example.demo.service.CandidatService;
import com.example.demo.service.ExperienceService;

@RestController
@RequestMapping("/exp")
@EnableAutoConfiguration
public class ExperienceController {

		@Autowired
		ExperienceService experienceService;
		
		@Autowired
		CandidatService candidatService;
		
		 @GetMapping("/{id}")
		    public ResponseEntity <Optional<Experience>> getById(@PathVariable("id") Long id) {
		    return new ResponseEntity<>(experienceService.getById(id), HttpStatus.OK);
		    }
		 @GetMapping("cv/{cvId}")
		    public ResponseEntity <List<Experience>> getByCv(@PathVariable("cvId") Long cvId) {
		    return new ResponseEntity<>(experienceService.getByCvId(cvId), HttpStatus.OK);
		    }
		 
		 @PostMapping("/add")
		    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience, UriComponentsBuilder builder) {
			 experienceService.addOne(experience);
		        return new ResponseEntity<Experience>(experience, HttpStatus.CREATED);
		    }


		    @PutMapping("/update")
		    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
		    	experienceService.addOne(experience);
		        return new ResponseEntity<Experience>(experience, HttpStatus.OK);
		    }


		    @DeleteMapping("/delete}")
		    public ResponseEntity<Void> deleteExperience(@RequestBody Experience experience) {
		    	experienceService.addOne(experience);
		        return new ResponseEntity<Void>(HttpStatus.OK);
		    }

		
}
