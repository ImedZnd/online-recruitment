package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.example.demo.model.Candidat;
import com.example.demo.model.Category;
import com.example.demo.model.Cv;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class DemoApplication extends RepositoryRestConfigurerAdapter   {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	 @Override
	    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	        config.exposeIdsFor(Offre.class,Candidat.class,Category.class,Postulation.class,Candidat.class,Client.class,Cv.class);
	    }
		
	

}
