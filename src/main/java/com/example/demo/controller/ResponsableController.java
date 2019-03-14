package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.example.demo.model.Client;
import com.example.demo.model.Responsable;
import com.example.demo.service.ResponsableService;

@RestController
@RequestMapping("/res")
@EnableAutoConfiguration
public class ResponsableController {

	@Autowired
	ResponsableService responsableService;
	
	 @GetMapping("/responsable/id/{id}")
	    public ResponseEntity<Optional<Responsable>> getResponsablebyId( @PathVariable(value = "id") Long id) {

	        System.out.println("get responsable with id\n");
	            return new ResponseEntity<>(
	            		responsableService.getById(id),
	            		HttpStatus.OK
	            		);
	    }
	 @GetMapping("/responsables/{sortby}")
	    public ResponseEntity<List> getAllResponsableSorted(@PathVariable String sortby){
	        System.out.println("get all responsable \n");

	        switch (sortby.toLowerCase()) {
	        case "name":
	            sortby = "name";
	            break;    
	        case "role":
	                sortby = "role";
	                break;
	            case "status":
	                sortby = "status";
	                break;
	            case "surename":
	                sortby = "surename";
	                break;
	            default:
	                sortby = "inscription";
	                break;
	        }
	        return new ResponseEntity<>(responsableService.getAll(sortby), HttpStatus.OK);
	    }
	 
	 @GetMapping(value = {"/responsables/name/{name}"})
	    public ResponseEntity<List<Responsable>> getResponsableByName( @PathVariable(value = "name") String name) {

	        System.out.println("get responsable with name\n");
	            return new ResponseEntity<>(
	            		responsableService.getByName(name),
	                    HttpStatus.OK
	            );
	    }

	 		@PostMapping("/responsable/add")
	 		public ResponseEntity<Responsable> addClient(@Valid @RequestBody Responsable responsable) {

	 					System.out.println("add a client \n");
	 		return new ResponseEntity<>(responsableService.addOne(responsable),HttpStatus.OK);
	 		}
	 		@DeleteMapping("/responsable/delete/{id}")
	 		public ResponseEntity deleteClient(@PathVariable ("id") Long id) {

	 			System.out.println("delete a client \n");
	 			responsableService.deleteById(id);
	 		return new ResponseEntity<>(HttpStatus.OK);
	 		}
	 	   @PutMapping("/responsables/update")
	 	    public ResponseEntity<Responsable> updateCandidat( @RequestBody Responsable newResponsable)  {
	 	            System.out.println("update responsable \n");
	 	            Optional<Responsable> oldResponsable = getResponsablebyId(newResponsable.getId()).getBody();
	 	            if (oldResponsable.isPresent()) {
	 	                return new ResponseEntity<Responsable>(addClient(newResponsable).getBody(), HttpStatus.OK);
	 	            } else {
	 	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 	            }
	 	    }
}
