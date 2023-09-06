package com.example.dakr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String serverport=env.getProperty("server.port");
		
		return "My greetings to you ...."+serverport;
		
	}
}
