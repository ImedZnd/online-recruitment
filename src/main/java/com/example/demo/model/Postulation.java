package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.demo.status.RoleName;
import com.example.demo.status.StatusResponsable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "postulation")
public class Postulation {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@ManyToOne
	private Offre offres;
	
	@ManyToOne
	private Candidat candidats;
	
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



	public Offre getOffres() {
		return offres;
	}

	public void setOffres(Offre offres) {
		this.offres = offres;
	}

	public Candidat getCandidats() {
		return candidats;
	}

	public void setCandidats(Candidat candidats) {
		this.candidats = candidats;
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

	public Postulation(Long id,  Date createdAt,
			Date modifiedAt) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public Postulation() {
		super();
	}
    
    
}
