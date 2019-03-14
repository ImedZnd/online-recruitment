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
import com.example.demo.status.StatusResponsable;



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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResponsableRole getRole() {
		return role;
	}

	public void setRole(ResponsableRole role) {
		this.role = role;
	}

	public StatusResponsable getStatus() {
		return status;
	}

	public void setStatus(StatusResponsable status) {
		this.status = status;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
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

	public Responsable(Long id, @NotBlank String name, ResponsableRole role, StatusResponsable status,
			@NotBlank String surename, @NotBlank String mail, Date inscription) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.status = status;
		this.surename = surename;
		this.mail = mail;
		this.inscription = inscription;
	}

	public Responsable() {
	}
	

}
