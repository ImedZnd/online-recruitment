package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;

import com.example.demo.status.StatusCandidat;
import com.example.demo.status.StatusClient;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "candidat")
public class Candidat  {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idPicture") 
	private Picture picture;
	
	@NotBlank
	private String name;
	
	
	private String surename;

	@NotBlank
	private String password;
	
	private String sexe;
	
    @Enumerated(EnumType.STRING)
	private StatusCandidat status;
    
    @NotBlank
    private String mail;
    
    @CreatedDate
    Date createdAt;

    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idCv") 
    Cv cv;
	
    @JsonIgnore
	@OneToMany(mappedBy="candidat")
	private Collection<Entretient> entretients;
    
    @JsonIgnore
	@OneToMany(mappedBy="candidat")
	private Collection<Rapport> rapport;
    
    @JsonIgnore
	@OneToMany(mappedBy="candidat")
	private Collection<Favorite> favorite;
	
    @JsonIgnore
	@OneToMany(mappedBy="candidats")
	private Collection<Postulation> postulation;

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

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public StatusCandidat getStatus() {
		return status;
	}

	public void setStatus(StatusCandidat status) {
		this.status = status;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Cv getCv() {
		return cv;
	}
	
	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
	
	public Collection<Entretient> getEntretients() {
		return entretients;
	}


	public void setEntretients(Collection<Entretient> entretients) {
		this.entretients = entretients;
	}



	public Candidat(Long id, Picture picture, @NotBlank String name, @NotBlank String surename,
			@NotBlank String password, @NotBlank String sexe, StatusCandidat status, @NotBlank String mail,
			Date createdAt, Cv cv) {
		super();
		this.id = id;
		this.picture = picture;
		this.name = name;
		this.surename = surename;
		this.password = password;
		this.sexe = sexe;
		this.status = StatusCandidat.ACTIVE ;
		this.mail = mail;
		this.createdAt = createdAt;
		this.cv = cv;
	}

	public Candidat() {
		super();
		this.status = StatusCandidat.ACTIVE ;
	}

	public Collection<Rapport> getRapport() {
		return rapport;
	}

	public void setRapport(Collection<Rapport> rapport) {
		this.rapport = rapport;
	}

	public Collection<Favorite> getFavorite() {
		return favorite;
	}

	public void setFavorite(Collection<Favorite> favorite) {
		this.favorite = favorite;
	}

	public Collection<Postulation> getPostulation() {
		return postulation;
	}

	public void setPostulation(Collection<Postulation> postulation) {
		this.postulation = postulation;
	}

}
