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
import com.example.demo.model.Formation;
import com.example.demo.model.Language;
import com.example.demo.service.FormationService;
import com.example.demo.service.LanguageService;

@RestController
@RequestMapping("/lan")
@EnableAutoConfiguration
public class LanguageController {
	
	@Autowired
	LanguageService languageService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity <Optional<Language>> getById(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(languageService.getById(id), HttpStatus.OK);
	    }
	 @GetMapping("cv/{cvId}")
	    public ResponseEntity <List<Language>> getByCv(@PathVariable("cvId") Long cvId) {
	    return new ResponseEntity<>(languageService.getByCvId(cvId), HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<Language> addLanguage(@RequestBody Language language, UriComponentsBuilder builder) {
		 languageService.addOne(language);
	        return new ResponseEntity<Language>(language, HttpStatus.CREATED);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<Language> updateLanguage(@RequestBody Language language) {
	    	languageService.addOne(language);
	        return new ResponseEntity<Language>(language, HttpStatus.OK);
	    }


	    @DeleteMapping("/delete}")
	    public ResponseEntity<Void> deleteLanguage(@RequestBody Language language) {
	    	languageService.addOne(language);
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    }

}
