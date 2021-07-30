programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LANCAMENTOS = 10
		inteiro jogadas[LANCAMENTOS], maior = 0, contador = 0
		real soma = 0.0, media
		

		para(inteiro x=0; x<LANCAMENTOS; x++){
			jogadas[x] = Util.sorteia(1,6)
			soma += jogadas[x]
			se(jogadas[x]>maior){
				maior = jogadas[x]
			}
		}
		
		para(inteiro x=0; x<LANCAMENTOS; x++){
			escreva("Lançamento nº",x+1," - ",jogadas[x],"\n")
			se(jogadas[x]==maior){
					contador+=1
				}
		}
		media = soma/LANCAMENTOS
		escreva("\nMédia dos valores lançados: ", media)
		escreva("\nVezes que o maior número foi lançado: ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */