package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@NotBlank
	private String discription;
	
	private int number;
	@JsonIgnore
	@OneToMany(mappedBy="location")
	private Set<Offre> offres;
}
