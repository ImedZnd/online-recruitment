package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.demo.status.StatusOffre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Offre {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String type;
	
	
	private Long salary;
	
	private Integer experience;
	
	private String eduLevel;
	
	private Date dateLimit;
		
	@NotBlank
	private String description;
	
	private String details;
	
	private StatusOffre statusOffre;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;

	@NotBlank
	@ManyToOne
	@JoinColumn(name="idLocation")
	private Location location;
	
    @CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;
    
    @ManyToOne
	@JoinColumn(name="idRapport")
	private Rapport rapport;
    
    @ManyToOne
	@JoinColumn(name="idFavorite")
	private Favorite favorite;
    
    @ManyToOne
	@JoinColumn(name="idPostulation")
	private Postulation postulation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getEduLevel() {
		return eduLevel;
	}

	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public Date getDateLimit() {
		return dateLimit;
	}

	public void setDateLimit(Date dateLimit) {
		this.dateLimit = dateLimit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public StatusOffre getStatusOffre() {
		return statusOffre;
	}

	public void setStatusOffre(StatusOffre statusOffre) {
		this.statusOffre = statusOffre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
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

	public Rapport getRapport() {
		return rapport;
	}

	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}

	public Favorite getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public Postulation getPostulation() {
		return postulation;
	}

	public void setPostulation(Postulation postulation) {
		this.postulation = postulation;
	}

	public Offre() {
		super();
	}

	public Offre(Long id, @NotBlank String title, @NotBlank String type, Long salary, Integer experience,
			String eduLevel, Date dateLimit, @NotBlank String description, String details, StatusOffre statusOffre,
			Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.salary = salary;
		this.experience = experience;
		this.eduLevel = eduLevel;
		this.dateLimit = dateLimit;
		this.description = description;
		this.details = details;
		this.statusOffre = statusOffre;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

 
}
