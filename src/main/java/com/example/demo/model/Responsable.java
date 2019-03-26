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

import com.example.demo.status.ResponsableRole;
import com.example.demo.status.StatusCandidat;
import com.example.demo.status.StatusResponsable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "responsable")
public class Responsable {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String name;
	
    @Enumerated(EnumType.STRING)
	private ResponsableRole role;
    
    @Enumerated(EnumType.STRING)
	private StatusResponsable status;
    
    @NotBlank
	private String surename;
    
    @NotBlank
    private String mail;
    
    private Date inscription;


	

}
