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
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idPicture") 
	private Picture picture;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String surename;

	@NotBlank
	private String password;
	
	@NotBlank
	private String sexe;
	
    @Enumerated(EnumType.STRING)
	private StatusCandidat status;
    
    @NotBlank
    private String mail;
    
    @CreatedDate
    Date createdAt;

    @OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idCv") 
    Cv cv;
	
	@OneToMany(mappedBy="candidat")
	private Collection<Entretient> entretients;
	
	@ManyToOne
	@JoinColumn(name="idRapport")
	private Rapport rapport;
	
	@ManyToOne
	@JoinColumn(name="idFavorite")
	private Favorite favorite;
	
	@ManyToOne
	@JoinColumn(name="idPostulation")
	private Postulation postulation;
}
