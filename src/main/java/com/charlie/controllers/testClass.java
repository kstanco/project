package com.charlie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testClass {
	
	@RequestMapping(value = "/getint", method = RequestMethod.GET)
	public int testEndpoint(){
		
		return 111;
	}

}
