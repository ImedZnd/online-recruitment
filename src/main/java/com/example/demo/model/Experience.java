package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experience")
public class Experience {
	
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="idPicture")          
	private Picture picture;
	
	@NotBlank
	private String establishmentName;
	
	@NotBlank
	private Date start;
	
	
	private Date end;
	
    @CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;
    
    @ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="idCv")
	private Cv cv;
}
