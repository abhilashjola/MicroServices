package com.example.dakr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dakr.GreetFeignClient;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private GreetFeignClient greetFeign;
	
	
	
	@GetMapping("/welcome")
	public String getWelcomeApi() {
		
		String greetMsg=greetFeign.invokeGreet();
		
		String welcome= "Welcome this is Micro services";
	
		return greetMsg+","+welcome+",server port=";
	}
}
