package com.qtechlabstacs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	
	@GetMapping("/api/v1/notification/welcome")
	private ResponseEntity<String> printMessage(){
		
		System.out.println("Notification Microservice is being called from Employee Microservice");
		
		return new ResponseEntity<String>("Thanks for calling me my bro Employee", HttpStatus.ALREADY_REPORTED);
		
		
	}
}
