programa
{
	
	funcao inicio(){
	inteiro numero = 0
	inteiro totalNumeros = 0
	inteiro contadorNumeros = 0

	escreva("Digite um numero positivo: ")
	leia(numero)
	faca {
		contadorNumeros++
		totalNumeros += contadorNumeros
		
		se (contadorNumeros == 1){
			escreva(contadorNumeros)
		}
		senao {
		 	escreva(" + ",contadorNumeros)
		}
	} enquanto(contadorNumeros < numero )
	escreva(" = ",totalNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */