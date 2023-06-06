package com.wiley.sbconcept.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@Value("${welcome.message}")
	private String msg;
	@GetMapping("/")
	public String helloworld() {
		return msg;
	}
}
