package com.example.demo.model;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.demo.status.StatusClient;
import com.example.demo.status.StatusCv;

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
	
	@NotBlank
	private String surename;
	
	@NotBlank
	private String sexe;

	private Date naissance;
	
	private String etatCivle;
	
	private String etatActuel;
	
	private String pays;
	
	private String gouvernement;
	
	private String ville;
	
	private String codePostale;
	
	private Long firstTel;
	
	private Long  SecondTel;
	
	private String firstMail;
	
	private String secondMail;
	
	private Date lastContact;
	
	private boolean dispo;
	
	private boolean waiting;
	
	@CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;
    
    
    @Autowired
    @OneToMany(mappedBy="cv")
    private Optional<Formation> formation;
    
    @Autowired
    @OneToMany(mappedBy="cv")
    private Optional<Competence> competence;
    
    @Autowired
    @OneToMany(mappedBy="cv")
    private Optional<Experience> experience;
    
    @Autowired
    @OneToMany(mappedBy="cv")
    private Optional<Language> language;

}
