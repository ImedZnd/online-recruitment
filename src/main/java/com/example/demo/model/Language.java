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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "language")
public class Language {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@NotBlank
	private String lange;
	
	private String speekLevel;
	
	private String writeLevel;
	
	private String readLevel;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="cv_id")
	private Cv cv;
}