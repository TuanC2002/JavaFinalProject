package com.example.finalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}
	@GetMapping("/")
	public String getApi(){
		return "Hello world";
	}

}
