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
	private String name;
	
	@NotBlank
	private String secteur;
	
	@NotBlank
	private Boolean is_engage;
    
	@Enumerated(EnumType.STRING)
	private StatusClient status;
	
	@NotBlank
	private String mail;
	
    private Date inscriptionDate;

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

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public Boolean getIs_engage() {
		return is_engage;
	}

	public void setIs_engage(Boolean is_engage) {
		this.is_engage = is_engage;
	}

	public StatusClient getStatus() {
		return status;
	}

	public void setStatus(StatusClient status) {
		this.status = status;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	public Client(Long id, @NotBlank String name, @NotBlank String secteur, @NotBlank Boolean is_engage,
			StatusClient status, @NotBlank String mail, Date inscriptionDate) {
		super();
		this.id = id;
		this.name = name;
		this.secteur = secteur;
		this.is_engage = is_engage;
		this.status = status;
		this.mail = mail;
		this.inscriptionDate = inscriptionDate;
	}

	public Client() {
		
	}

    

}
