package com.ecommerce.fashionbrand.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControlleer {
	@GetMapping("/home")

	public String home() {
		return "hii this is home controller";
	}
}
