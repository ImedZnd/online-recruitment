package com.example.demo.model;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.demo.status.StatusClient;
import com.example.demo.status.StatusCv;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
public class Cv {
	
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private StatusCv status;
	
	@NotBlank
	private String name;
	
	private String surename;
	
	private String sexe;

	private Date naissance;
	
	private String monthOfExp;
	
	private String etatCivle;
	
	private String etatActuel;
	
	private String pays;
	
	private String gouvernement;
	
	private String ville;
	
	private String codePostale;
	
	private Long firstTel;
	
	private Long  secondTel;
	
	private String firstMail;
	
	private String secondMail;
	
	private Date lastContact;
	
	private boolean dispo;
	
	private boolean waiting;
	
	@CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;

    @OneToOne
    private Candidat candidat;
    
    @JsonIgnore
    @OneToMany(mappedBy="cv")
    private Set<Formation> formation;
    
    @JsonIgnore
    @OneToMany(mappedBy="cv")
    private Set<Competence> competence;
    
    @JsonIgnore
    @OneToMany(mappedBy="cv")
    private Set<Experience> experience;
    
    @JsonIgnore
    @OneToMany(mappedBy="cv")
    private Set<Language> language;

}
