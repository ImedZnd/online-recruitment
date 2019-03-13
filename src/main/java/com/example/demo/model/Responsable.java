package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.status.ResponsableRole;
import com.example.demo.status.StatusResponsable;



@Entity
@Table(name = "responsable")
public class Responsable {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	private String name;
	
    @Enumerated(EnumType.STRING)
	private ResponsableRole role;
    
    @Enumerated(EnumType.STRING)
	private StatusResponsable status;
	

}
