package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.status.StatusClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@Autowired
	private Picture picture;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String secteur;
	
	@NotBlank
	private Boolean is_engage;
    
	@Enumerated(EnumType.STRING)
	private StatusClient status;
	
	@NotBlank
	private String mail;
	
	@NotBlank
	private Integer role;

	@OneToMany(mappedBy="client")
	private Collection<Offre> offres;
	



    

}
