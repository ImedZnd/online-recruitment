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

import com.example.demo.status.StatusClient;


@Entity
@Table(name = "client")
public class Client {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String secteur;
	
	@NotBlank
	private Boolean is_engage;
    
	@Enumerated(EnumType.STRING)
	private StatusClient status;
	
	@NotBlank
	private String mail;
	
    private Date inscriptionDate;


}
