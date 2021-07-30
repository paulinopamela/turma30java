programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4
		
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)
		limpa()

		se (Mat.potencia(n3, 2)>=1000){
			escreva("O quadrado de ", n3, " é igual a ", Mat.potencia(n3, 2))
		}
		senao{
			escreva("O quadrado de ", n1, " é igual a ", Mat.potencia(n1, 2))
			escreva("\nO quadrado de ", n2, " é igual a ", Mat.potencia(n2, 2))
			escreva("\nO quadrado de ", n3, " é igual a ", Mat.potencia(n3, 2))
			escreva("\nO quadrado de ", n4, " é igual a ", Mat.potencia(n4, 2))
		}
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */