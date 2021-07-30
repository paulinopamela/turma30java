programa
{	
	funcao inicio()
	{
		inteiro x, numero
		real media, soma, total

		numero = 1
		soma = 0.0
		media = 0.0
		total = 0.0
			
		enquanto(numero>0){
			escreva("Digite um número: ")
			leia(numero)
			total += 1 
			soma = soma + numero
			media = soma / total
		}

		escreva("Total: ", soma)
		escreva("\nMédia: ", media)
		escreva("\nTotal valores lidos: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 136; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */