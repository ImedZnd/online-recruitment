package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CvService;

@RestController
@RequestMapping("/cv")
@EnableAutoConfiguration
public class CvController {

	@Autowired
	CvService cvService;
	
}
