programa
{
	
	funcao inicio()
	{
		inteiro n
		
		escreva("Digite um número inteiro: ")
		leia(n)

		se(n==0){
			escreva("O número digitado é nulo.")
		}
		senao se(n<0){
			escreva("O número digitado é negativo")
		}
		senao se(n%2==1){
			escreva("O número digitado é impar.")
		}		
		senao{
			escreva("O número digitado é par")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */