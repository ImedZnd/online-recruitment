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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offre {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String place;
	
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
}
