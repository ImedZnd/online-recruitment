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

import com.example.demo.model.Offre;
import com.example.demo.service.FavoriteService;
import com.example.demo.service.OffreService;
import com.example.demo.service.PostulationService;
import com.example.demo.service.RapportService;
import com.example.demo.status.StatusOffre;

@RestController
@RequestMapping("/off")
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
	
	@CrossOrigin(origins = "*")
    @PostMapping("/add")
	  public ResponseEntity<Offre> addOffre( @RequestBody Offre offre) {

        System.out.println("add an offre \n");
        return new ResponseEntity<>(offreService.addOne(offre),HttpStatus.OK);
		}

	
	@CrossOrigin(origins = "*")
	@GetMapping(value = {"/id/{id}"})
    public ResponseEntity<Optional<Offre>> getById( @PathVariable(value = "id") Long id) {

        System.out.println("get an offre with  id "+ id +"\n");
            return new ResponseEntity<>(
            		offreService.getById(id),
                    HttpStatus.OK
            );
    }
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = {"/client/{id}"})
    public ResponseEntity<Optional<Offre>> getByClient( @PathVariable(value = "id") Long id) {

        System.out.println("get All Offres\n");
            return new ResponseEntity<>(
            		offreService.getByClientId(id),
                    HttpStatus.OK
            );
    }
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = {"/"})
    public ResponseEntity<List<Offre>> getAll( ) {

        System.out.println("get an offre with id\n");
            return new ResponseEntity<>(
            		offreService.getAllOffres(),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
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
	@CrossOrigin(origins = "*")
    @DeleteMapping("/cv/delete/{id}")
    public ResponseEntity deleteOffre(@PathVariable ("id") Long id) {

            System.out.println("delete a Offre \n");
            offreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/title/{title}"})
    public ResponseEntity<Optional<Offre>> getByTitleContaining( @PathVariable(value = "title") String title) {

        System.out.println("get Offre with title\n");
            return new ResponseEntity<>(
            		offreService.getByTitleContaining(title),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/discrip/{discrip}"})
    public ResponseEntity<Optional<Offre>> getByDescriptionContaining( @PathVariable(value = "discrip") String discrip) {

        System.out.println("get Offre with discrip\n");
            return new ResponseEntity<>(
            		offreService.getByDescriptionContaining(discrip),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/detail/{detail}"})
    public ResponseEntity<Optional<Offre>> getByDetailsContaining( @PathVariable(value = "detail") String detail) {

        System.out.println("get Offre with detail\n");
            return new ResponseEntity<>(
            		offreService.getByDetailsContaining(detail),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/favorit/{favoritId}"})
    public ResponseEntity<Optional<Offre>> getByFavorit( @PathVariable(value = "favoritId") Long favoritId) {

        System.out.println("get Offre with detail\n");
            return new ResponseEntity<>(
            		offreService.getByFavoriteId(favoritId),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/rapport/{rapportId}"})
    public ResponseEntity<Optional<Offre>> getByRapport( @PathVariable(value = "rapportId") Long rapportId) {

        System.out.println("get Offre with rapport\n");
            return new ResponseEntity<>(
            		offreService.getByRapportId(rapportId),
                    HttpStatus.OK
            );
    }

	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/type/{type}"})
    public ResponseEntity<Optional<Offre>> getByType( @PathVariable(value = "type") String type) {

        System.out.println("get Offre with type\n");
            return new ResponseEntity<>(
            		offreService.getByType(type),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/statusOffre/{statusOffre}"})
    public ResponseEntity<Optional<Offre>> getByStatusOffre( @PathVariable(value = "statusOffre") StatusOffre statusOffre) {

        System.out.println("get Offre with statusOffre\n");
            return new ResponseEntity<>(
            		offreService.getByStatusOffre(statusOffre),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/category/{categoryId}"})
    public ResponseEntity<Optional<Offre>> getByCategory( @PathVariable(value = "categoryId") Long categoryId) {

        System.out.println("get Offre with category\n");
            return new ResponseEntity<>(
            		offreService.getByCategoryId(categoryId),
                    HttpStatus.OK
            );
    }
	@CrossOrigin(origins = "*")
    @GetMapping(value = {"/location/{locId}"})
    public ResponseEntity<Optional<Offre>> getByLocationId( @PathVariable(value = "locId") Long locId) {

        System.out.println("get Offre with location\n");
            return new ResponseEntity<>(
            		offreService.getByLocationId(locId),
                    HttpStatus.OK
            );
    }
}
