package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "entretient")
public class Entretient {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	private String type;
	
	private String compteRendu;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.REFRESH})
	private Candidat candidat;
	
    @CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompteRendu() {
		return compteRendu;
	}

	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Entretient(Long id, String type, String compteRendu, Candidat candidat, Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.type = type;
		this.compteRendu = compteRendu;
		this.candidat = candidat;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public Entretient() {
		super();
	}
    
}
