package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OffreService;

@RestController
@RequestMapping("/ofr")
@EnableAutoConfiguration
public class OffreController {
	@Autowired
	OffreService offreService;
}
