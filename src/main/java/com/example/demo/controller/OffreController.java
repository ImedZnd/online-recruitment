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

import com.example.demo.model.Category;
import com.example.demo.model.Client;
import com.example.demo.model.Cv;
import com.example.demo.model.Favorite;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.model.Rapport;
import com.example.demo.repository.PostulationRepository;
import com.example.demo.service.FavoriteService;
import com.example.demo.service.OffreService;
import com.example.demo.service.PostulationService;
import com.example.demo.service.RapportService;
import com.example.demo.status.StatusOffre;

@RestController
@RequestMapping("/ofr")
@EnableAutoConfiguration
public class OffreController {
	@Autowired
	OffreService offreService;
	
	@Autowired
	RapportService rapportService;
	
	@Autowired
	FavoriteService favoriteService;
	
	@Autowired
	PostulationService postulationService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
	  public ResponseEntity<Offre> addOffre(@Valid @RequestBody Offre offre) {

        System.out.println("add an offre \n");
        return new ResponseEntity<>(offreService.addOne(offre),HttpStatus.OK);
		}
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = {"/id/{id}"})
    public ResponseEntity<Optional<Offre>> getById( @PathVariable(value = "id") Long id) {

        System.out.println("get an offre with id\n");
            return new ResponseEntity<>(
            		offreService.getById(id),
                    HttpStatus.OK
            );
    }
    @PutMapping("/offre/update/{id}")
    public ResponseEntity<Offre> updateOffre( @RequestBody Offre newOffre)  {
            System.out.println("update offre \n");
            Optional<Offre> oldOffre = getById(newOffre.getId()).getBody();
            if (oldOffre.isPresent()) {
                return new ResponseEntity<>(addOffre(newOffre).getBody(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
    @DeleteMapping("/cv/delete/{id}")
    public ResponseEntity deleteOffre(@PathVariable ("id") Long id) {

            System.out.println("delete a Offre \n");
            offreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping(value = {"/title/{title}"})
    public ResponseEntity<Optional<Offre>> getByTitleContaining( @PathVariable(value = "title") String title) {

        System.out.println("get Offre with title\n");
            return new ResponseEntity<>(
            		offreService.getByTitleContaining(title),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/discrip/{discrip}"})
    public ResponseEntity<Optional<Offre>> getByDescriptionContaining( @PathVariable(value = "discrip") String discrip) {

        System.out.println("get Offre with discrip\n");
            return new ResponseEntity<>(
            		offreService.getByDescriptionContaining(discrip),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/detail/{detail}"})
    public ResponseEntity<Optional<Offre>> getByDetailsContaining( @PathVariable(value = "detail") String detail) {

        System.out.println("get Offre with detail\n");
            return new ResponseEntity<>(
            		offreService.getByDetailsContaining(detail),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/favorit/{favorit}"})
    public ResponseEntity<Optional<Offre>> getByFavorit( @PathVariable(value = "favorit") Favorite favorit) {

        System.out.println("get Offre with detail\n");
            return new ResponseEntity<>(
            		offreService.getByFavorite(favorit),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/rapport/{rapport}"})
    public ResponseEntity<Optional<Offre>> getByRapport( @PathVariable(value = "rapport") Rapport rapport) {

        System.out.println("get Offre with rapport\n");
            return new ResponseEntity<>(
            		offreService.getByRapport(rapport),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/postulation/{postulation}"})
    public ResponseEntity<Optional<Offre>> getByPostulation( @PathVariable(value = "postulation") Postulation postulation) {

        System.out.println("get Offre with postulation\n");
            return new ResponseEntity<>(
            		offreService.getByPostulation(postulation),
                    HttpStatus.OK
            );
    }

    @GetMapping(value = {"/type/{type}"})
    public ResponseEntity<Optional<Offre>> getByType( @PathVariable(value = "type") String type) {

        System.out.println("get Offre with type\n");
            return new ResponseEntity<>(
            		offreService.getByType(type),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/statusOffre/{statusOffre}"})
    public ResponseEntity<Optional<Offre>> getByStatusOffre( @PathVariable(value = "statusOffre") StatusOffre statusOffre) {

        System.out.println("get Offre with statusOffre\n");
            return new ResponseEntity<>(
            		offreService.getByStatusOffre(statusOffre),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/client/{client}"})
    public ResponseEntity<Optional<Offre>> getByClient( @PathVariable(value = "client") Client client) {

        System.out.println("get Offre with client\n");
            return new ResponseEntity<>(
            		offreService.getByClient(client),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/category/{category}"})
    public ResponseEntity<Optional<Offre>> getByCategory( @PathVariable(value = "category") Category category) {

        System.out.println("get Offre with category\n");
            return new ResponseEntity<>(
            		offreService.getByCategory(category),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/location/{location}"})
    public ResponseEntity<Optional<Offre>> getByLocation( @PathVariable(value = "location") Location location) {

        System.out.println("get Offre with location\n");
            return new ResponseEntity<>(
            		offreService.getByLocation(location),
                    HttpStatus.OK
            );
    }
}
