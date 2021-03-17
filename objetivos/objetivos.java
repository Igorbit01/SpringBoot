package com.halloworld.hallo.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController

	@RequestMapping("/objetivos")

	public class objetivos {
	@GetMapping
	
	public String objetivo() {
		
		return "O objetivo da semana é entender melhor Spring e treinar MySql e Poo";
	}

}
