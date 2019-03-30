package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.demo.status.ResponsableRole;
import com.example.demo.status.StatusResponsable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "postulation")
public class Postulation {

	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long id;
	
	@OneToMany(mappedBy="postulation")
	private Collection<Offre> offres;
	
	@OneToMany(mappedBy="postulation")
	private Collection<Candidat> candidats;
	
    @CreatedDate
    Date createdAt;
     
    @LastModifiedDate
    Date modifiedAt;
}
