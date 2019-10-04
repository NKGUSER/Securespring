package com;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootApp.class, args);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		return "{\"data\":\"Hello World\"}";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/Hello")
	public String Hello() {
		return "Hello";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/world")
	public String world() {
		throw new NotFoundException();
	}
}
