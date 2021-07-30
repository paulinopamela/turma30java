programa
{
	
	funcao inicio()
	{
		real p, E, m
		
		escreva("Qual o peso da compra de tomates? ")
		leia(p)
		limpa()
		
		E = 0
		m = 0 
		
		se (p<=50.0){
			escreva("O peso total dos tomates é ", p, " e você não foi multado")
		}
		senao{
			E = p - 50.0
			m = E * 4.0
			escreva("O peso total dos tomates é ", p, " pois você excedeu o peso em ", E, "kg. Sua multa será de R$ ", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */