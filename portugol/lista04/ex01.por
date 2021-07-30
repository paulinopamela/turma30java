programa
{
	
	funcao inicio()
	{
		const inteiro LEITURA = 5
		real pontuacao[LEITURA], maior = 0

		para(inteiro i=0; i<LEITURA; i++){
			escreva("Digite a pontuação: ")
			leia(pontuacao[i])
			se(pontuacao[i]>maior){
			maior = pontuacao[i]
			}
		}
		escreva("A maior pontuação foi ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */