package com.exercicio01.exercicio01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio01")

public class Exercicio01Controller {

	@GetMapping
	public String exercicio(){
		return "Persistência e Orientação ao Detalhe";
	}
}
