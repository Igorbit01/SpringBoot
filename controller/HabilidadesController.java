package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hallo")

public class HabilidadesController {

	@GetMapping
	public String hallo () {
		return "Persistencia, Atençao ao detalhe, mentalidade de crescimento ";
	}
}
