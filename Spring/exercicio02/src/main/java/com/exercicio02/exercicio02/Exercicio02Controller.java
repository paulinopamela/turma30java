package com.exercicio02.exercicio02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio02")

public class Exercicio02Controller {
	@GetMapping
	public String exercicio(){
		return "Focar na compreensão do conteúdo e entrega das atividades.";
	}

}
