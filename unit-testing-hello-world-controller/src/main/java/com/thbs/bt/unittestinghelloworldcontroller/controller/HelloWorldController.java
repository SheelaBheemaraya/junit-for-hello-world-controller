package com.thbs.bt.unittestinghelloworldcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String Hello()
	{
		return "Hello World";
	}

}
