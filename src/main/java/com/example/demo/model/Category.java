package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@Column(length = 3000)
	private String discription;
	
	private int number;
	
	@JsonIgnore
	@OneToMany(mappedBy="category")
	private List<Offre> offres;
}
