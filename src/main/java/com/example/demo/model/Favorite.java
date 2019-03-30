package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "favorite")
public class Favorite {
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@OneToMany(mappedBy="favorite")
	private Collection<Offre> offres;
	
	@OneToMany(mappedBy="favorite")
	private Collection<Candidat> candidat;
	
    @CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;
}
