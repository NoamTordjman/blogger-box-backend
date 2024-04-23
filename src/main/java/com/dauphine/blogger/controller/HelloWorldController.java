package com.dauphine.blogger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(
		name = "Hello world API",
		description = "My first hello world enpoints"
		
		)




public class HelloWorldController {

	@GetMapping("hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("hello")
	public String helloByName(@RequestParam String name) {
		return "Hello " + name;
	}
	
	@GetMapping("hello/{name}")
	@Operation(
			summary = "Hello by name endpoint",
			description = "Returns 'Hello {name}' by path variable"
			)
	
	public String hello(
			@Parameter(description = "name to greet")
			@PathVariable String name
			) {
		return "Hello" + name;
	}
}
