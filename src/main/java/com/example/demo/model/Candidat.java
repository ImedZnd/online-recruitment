package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.example.demo.status.StatusCandidat;
import com.example.demo.status.StatusClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidat")
public class Candidat {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String surename;
	
	@NotBlank
	private String sexe;
	
    @Enumerated(EnumType.STRING)
	private StatusCandidat status;
    
    @NotBlank
    private String mail;
    
    private Date inscription;


	
}
