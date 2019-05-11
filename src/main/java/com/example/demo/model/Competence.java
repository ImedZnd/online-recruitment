package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "competence")
public class Competence {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String level;
	
	private String monthOfExp;
	
	@JsonIgnore
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="idCv")
	private Cv cv;

	public Competence(int id, @NotBlank String name, @NotBlank String level, String monthOfExp, Cv cv) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.monthOfExp = monthOfExp;
		this.cv = cv;
	}

	public Competence() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMonthOfExp() {
		return monthOfExp;
	}

	public void setMonthOfExp(String monthOfExp) {
		this.monthOfExp = monthOfExp;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
	
	
}
