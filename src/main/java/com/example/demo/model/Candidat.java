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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nom) {
		this.name = nom;
	}

	public String getsSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public StatusCandidat getStatu() {
		return status;
	}

	public void setStatu(StatusCandidat statu) {
		this.status = statu;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	public Candidat(Long id, @NotBlank String nom, @NotBlank String surename, @NotBlank String sexe,
			StatusCandidat statu, @NotBlank String mail, Date inscription) {
		super();
		this.id = id;
		this.name = nom;
		this.surename= surename;
		this.sexe = sexe;
		this.status = statu;
		this.mail = mail;
		this.inscription = inscription;
	}
	
	
}
