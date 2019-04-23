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
import com.example.demo.model.Entretient;
import com.example.demo.model.Favorite;
import com.example.demo.service.CandidatService;
import com.example.demo.service.FavoriteService;

@RestController
@RequestMapping("/fav")
@EnableAutoConfiguration
public class FavoriteController {

	@Autowired
	FavoriteService favoriteService ;
	
	@Autowired
	CandidatService candidatService;
	
	@GetMapping("/{id}")
    public ResponseEntity <Optional<Favorite>> getById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(favoriteService.getById(id), HttpStatus.OK);
    }
 @GetMapping("can/{can}")
    public ResponseEntity <List<Favorite>> getByCandidat(@PathVariable("can") Candidat can) {
    return new ResponseEntity<>(favoriteService.getByCandidat(can), HttpStatus.OK);
    }
 
 @PostMapping("/add")
    public ResponseEntity<Favorite> addFavorite(@RequestBody Favorite favorite, UriComponentsBuilder builder) {
	 favoriteService.addOne(favorite);
        return new ResponseEntity<Favorite>(favorite, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Favorite> updateFavorite(@RequestBody Favorite favorite) {
    	favoriteService.addOne(favorite);
        return new ResponseEntity<Favorite>(favorite, HttpStatus.OK);
    }


    @DeleteMapping("/delete}")
    public ResponseEntity<Void> deleteFavorite(@RequestBody Favorite favorite) {
    	favoriteService.addOne(favorite);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
