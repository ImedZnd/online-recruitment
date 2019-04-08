package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Candidat;
import com.example.demo.model.Cv;
import com.example.demo.service.CompetenceService;
import com.example.demo.service.CvService;
import com.example.demo.service.ExperienceService;
import com.example.demo.service.FormationService;

@RestController
@RequestMapping("/cv")
@EnableAutoConfiguration
public class CvController {

	@Autowired
	CvService cvService;
	
	@Autowired
	FormationService formationService;
	
	@Autowired
	ExperienceService experienceService;
	
	@Autowired
	CompetenceService competenceServicel;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cv/add")
	  public ResponseEntity<Cv> addCv(@Valid @RequestBody Cv cv) {

        System.out.println("add a candidat \n");
        return new ResponseEntity<>(cvService.addOne(cv),HttpStatus.OK);
}
}
