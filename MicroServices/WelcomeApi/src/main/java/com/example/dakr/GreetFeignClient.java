package com.example.dakr;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("GREET-API")
public interface GreetFeignClient {

	@GetMapping("/greet")
	public String invokeGreet();
}
