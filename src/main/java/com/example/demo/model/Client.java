package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.status.StatusClient;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "client")
public class Client {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idPicture")          
	private Picture picture;
	
	private String name;
	
	private String secteur;
	
	@Column(length = 3000)
	private String Adresse;
	
	@Column(length = 3000)
	private String description;
	
	private Boolean is_engage;
    
	@Enumerated(EnumType.STRING)
	private StatusClient status;
	
	private String mail;
	
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy="client")
	private Collection<Offre> offres;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client(Long id, Picture picture, @NotBlank String name, @NotBlank String secteur,
			@NotBlank Boolean is_engage, StatusClient status, @NotBlank String mail, @NotBlank String password,
			@NotBlank Integer role, String adresse,String description) {
		super();
		this.id = id;
		this.picture = picture;
		this.name = name;
		this.secteur = secteur;
		this.is_engage = is_engage;
		this.status = status;
		this.mail = mail;
		this.password = password;
		this.Adresse = adresse;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public Client() {
		super();
	}

}
