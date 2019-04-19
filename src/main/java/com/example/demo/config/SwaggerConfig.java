package com.example.demo.config;

import static com.google.common.collect.Lists.newArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Profile("dev")
@EnableSwagger2
@EnableWebMvc
@Configuration
public class SwaggerConfig {
//	@Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2)  
//          .select()                                  
//          .apis(RequestHandlerSelectors.any())              
//          .paths(PathSelectors.any())                          
//          .build();                                           
//    }
	

	    @Bean
	    public Docket api(){
			return new Docket(DocumentationType.SWAGGER_2)
	      .select()
	          .apis(RequestHandlerSelectors.any())  // If you want to list all the apis including springboots own
	          //.apis(RequestHandlerSelectors.basePackage("com.app.api"))
	          .build()
	      .pathMapping("/")
	      .useDefaultResponseMessages(false)
	      //.directModelSubstitute(LocalDate.class, String.class)
	      .genericModelSubstitutes(ResponseEntity.class)
	      ;
	    }


}