package com.qtechlabstacs.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

	
	@GetMapping("/api/v1/employee/welcome")
	private ResponseEntity<String> printMessage(){
		
		System.out.println("Employee Microservice is being called from HTTP Client Browser");

		RestTemplate httpJavaClient = new RestTemplate();
		
		ResponseEntity<String> response = httpJavaClient.exchange("http://localhost:8082/api/v1/notification/welcome", HttpMethod.GET, null, String.class);
			
		System.out.println("status: " + response.getStatusCode());
		return new ResponseEntity<String>(response.getBody(), HttpStatus.OK);
		
		
	}
}
