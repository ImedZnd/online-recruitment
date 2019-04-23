package com.example.demo.controller;

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
import com.example.demo.model.Location;
import com.example.demo.service.LocationService;

@RestController
@RequestMapping("/loc")
@EnableAutoConfiguration
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Location>> getLocationbyId( @PathVariable(value = "id") Long id) {

        System.out.println("get Location with id\n");
            return new ResponseEntity<>(
            		locationService.getById(id),
            		HttpStatus.OK
            		);
    }
	   @CrossOrigin(origins = "*")
	    @PostMapping("/add")
	    public ResponseEntity<Location> addCategory(@Valid @RequestBody Location location) {

	            System.out.println("add a Location \n");
	            return new ResponseEntity<>(locationService.addOne(location),HttpStatus.OK);
	    }
	    @CrossOrigin(origins = "*")
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity deleteCategory(@PathVariable ("id") Long id) {

	            System.out.println("delete a Location \n");
	            locationService.deleteById(id);
	            return new ResponseEntity<>(HttpStatus.OK);
	    }
	    @CrossOrigin(origins = "*")
	    @PutMapping("/update")
	    public ResponseEntity<Location> updateLocation( @RequestBody Location newLocation)  {
	            System.out.println("update Location \n");
	            Optional<Location> oldLocation = getLocationbyId(newLocation.getId()).getBody();
	            if (oldLocation.isPresent()) {
	                return new ResponseEntity<>(addCategory(newLocation).getBody(), HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }
	    }
}

