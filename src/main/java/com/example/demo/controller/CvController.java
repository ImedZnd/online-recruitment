package com.example.demo.controller;

import java.util.Date;
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

import com.example.demo.model.Candidat;
import com.example.demo.model.Competence;
import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Formation;
import com.example.demo.model.Language;
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
    @PostMapping("/add")
	  public ResponseEntity<Cv> addCv(@Valid @RequestBody Cv cv) {

        System.out.println("add a CV \n");
        return new ResponseEntity<>(cvService.addOne(cv),HttpStatus.OK);
		}
	
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = {"/name/{name}"})
    public ResponseEntity<List> getByName( @PathVariable(value = "name") String name) {

        System.out.println("get CV with name\n");
            return new ResponseEntity<>(
            		cvService.getByName(name),
                    HttpStatus.OK
            );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = {"/id/{id}"})
    public ResponseEntity<Optional<Cv>> getById( @PathVariable(value = "id") int id) {

        System.out.println("get CV with id\n");
            return new ResponseEntity<>(
            		cvService.getById(id),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/surename/{surename}"})
    public ResponseEntity<List> getBySurename( @PathVariable(value = "surename") String surename) {

        System.out.println("get CV with surename\n");
            return new ResponseEntity<>(
            		cvService.getBySurename(surename),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/sexe/{sexe}"})
    public ResponseEntity<List> getBySexe( @PathVariable(value = "sexe") String sexe) {

        System.out.println("get CV with sexe\n");
            return new ResponseEntity<>(
            		cvService.getBySurename(sexe),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/etatcivle/{etatcivle}"})
    public ResponseEntity<List> getByEtatCivle( @PathVariable(value = "EtatCivle") String etatCivle) {

        System.out.println("get CV with EtatCivle\n");
            return new ResponseEntity<>(
            		cvService.getByEtatCivle(etatCivle),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/etatactue/{etatactue}"})
    public ResponseEntity<List> getByEtatActue( @PathVariable(value = "etatactue") String etatactue) {

        System.out.println("get CV with etatactue\n");
            return new ResponseEntity<>(
            		cvService.getByEtatActuel(etatactue),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/monthofexp/{monthofexp}"})
    public ResponseEntity<List> getByMonthOfExp( @PathVariable(value = "monthofexp") String monthofexp) {

        System.out.println("get CV with monthofexp\n");
            return new ResponseEntity<>(
            		cvService.getByMonthOfExp(monthofexp),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/pays/{pays}"})
    public ResponseEntity<List> getByPays( @PathVariable(value = "pays") String pays) {

        System.out.println("get CV with pays\n");
            return new ResponseEntity<>(
            		cvService.getByPays(pays),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/gouvernement/{gouvernement}"})
    public ResponseEntity<List> getByGouvernement( @PathVariable(value = "gouvernement") String gouvernement) {

        System.out.println("get CV with gouvernement\n");
            return new ResponseEntity<>(
            		cvService.getByGouvernement(gouvernement),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/ville/{ville}"})
    public ResponseEntity<List> getByVille( @PathVariable(value = "ville") String ville) {

        System.out.println("get CV with ville\n");
            return new ResponseEntity<>(
            		cvService.getByVille(ville),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/codepostale/{codepostale}"})
    public ResponseEntity<List> getByCodePostale( @PathVariable(value = "codepostale") String codepostale) {

        System.out.println("get CV with codepostale\n");
            return new ResponseEntity<>(
            		cvService.getByCodePostale(codepostale),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/tel/{tel}"})
    public ResponseEntity<List> getByTel( @PathVariable(value = "tel") Long tel) {

        System.out.println("get CV with tel\n");
            return new ResponseEntity<>(
            		cvService.getByFirstTel(tel),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/mail/{mail}"})
    public ResponseEntity<List> getByMail( @PathVariable(value = "mail") String mail) {

        System.out.println("get CV with mail\n");
            return new ResponseEntity<>(
            		cvService.getByFirstMail(mail),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/contact/{contact}"})
    public ResponseEntity<List> getByContact( @PathVariable(value = "contact") Date contact) {

        System.out.println("get CV with contact\n");
            return new ResponseEntity<>(
            		cvService.getByLastContact(contact),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/dispo/{dispo}"})
    public ResponseEntity<List> getByDispo( @PathVariable(value = "dispo") boolean dispo) {

        System.out.println("get CV with dispo\n");
            return new ResponseEntity<>(
            		cvService.getByDispo(dispo),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/waiting/{waiting}"})
    public ResponseEntity<List> getByWaiting( @PathVariable(value = "waiting") boolean waiting) {

        System.out.println("get CV with dispo\n");
            return new ResponseEntity<>(
            		cvService.getByWaiting(waiting),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/modifiedAt/{modifiedAt}"})
    public ResponseEntity<List> getByModifiedAt( @PathVariable(value = "modifiedAt") Date modifiedAt) {

        System.out.println("get CV with modifiedAt\n");
            return new ResponseEntity<>(
            		cvService.getByModifiedAt(modifiedAt),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/formation/{formation}"})
    public ResponseEntity<List> getByFormation( @PathVariable(value = "formation") Formation formation) {

        System.out.println("get CV with formation\n");
            return new ResponseEntity<>(
            		cvService.getByFormation(formation),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/competence/{competence}"})
    public ResponseEntity<List> getByCompetence( @PathVariable(value = "competence") Competence competence) {

        System.out.println("get CV with competence\n");
            return new ResponseEntity<>(
            		cvService.getByCompetence(competence),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/experience/{experience}"})
    public ResponseEntity<List> getByExperience( @PathVariable(value = "competence") Experience experience) {

        System.out.println("get CV with experience\n");
            return new ResponseEntity<>(
            		cvService.getByExperience(experience),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/language/{language}"})
    public ResponseEntity<List> getByLanguage( @PathVariable(value = "language") Language language) {

        System.out.println("get CV with language\n");
            return new ResponseEntity<>(
            		cvService.getByLanguage(language),
                    HttpStatus.OK
            );
    }
    @GetMapping(value = {"/esnameandperiode/{esname}/{start}/{end}"})
    public ResponseEntity<List> getBymonthOfExperience( String esname,Date start,Date end) {
        System.out.println("get CV with monthOfExperience\n");
            return new ResponseEntity<>(
            		//experienceService.getByestablishmentNameAndPeriode(esname,start,end),
                    HttpStatus.OK
            );
    }
    @PutMapping("/cv/update/{id}")
    public ResponseEntity<Cv> updateCandidat( @RequestBody Cv newCv)  {
            System.out.println("update CV \n");
            Optional<Cv> oldCv = getById(newCv.getId()).getBody();
            if (oldCv.isPresent()) {
                return new ResponseEntity<>(addCv(newCv).getBody(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
    @DeleteMapping("/cv/delete/{id}")
    public ResponseEntity deleteCandidat(@PathVariable ("id") Long id) {

            System.out.println("delete a candidat \n");
            cvService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }
}
