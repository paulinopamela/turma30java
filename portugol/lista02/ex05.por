programa
{
	
	funcao inicio()
	{
		real i
		
		escreva("Qual o índice de poluição? ")
		leia(i)
		
		se(i>0 e i<0.25){
			escreva("índice de poluição aceitável.")
		}
		senao se(i>0.25 e i<=0.39){
			escreva("As indústrias do 1º grupo devem suspender as atividades")
		}
		senao se(i> 0.39 e i<=0.49){
			escreva("As indústrias do 1º e 2º grupo são intimadas a suspender as atividades.")
		}
		senao{
			escreva("Todos os grupos devem ser notificadas a suspender as atividades.")
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */