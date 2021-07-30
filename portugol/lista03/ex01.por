programa
{
	inclua biblioteca Matematica	--> Mat
	funcao inicio()
	{
		real salario, totalSalario, mediaSalario, maiorSalario, percentualSalario, totalPercentual, totalFilhos, mediaFilhos
		inteiro x, habitantes, filhos
		const inteiro SALARIO100 = 100

		habitantes = 20
		totalSalario = 0.0
		mediaSalario = 0.0
		totalFilhos = 0.0
		mediaFilhos = 0.0
		maiorSalario = 0.0
		percentualSalario = 0.0
		totalPercentual = 0.0
		
		para (x=1; x<=habitantes;x++){
			escreva("Quanto é o salário? ")
			leia(salario)
			escreva("Quantos filhos? ")
			leia(filhos)

			totalSalario += salario
			mediaSalario = totalSalario / habitantes

			totalFilhos += filhos
			mediaFilhos = totalFilhos / habitantes

			se (salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario <= SALARIO100){
				percentualSalario++
				totalPercentual = (percentualSalario / habitantes) * 100
			}
			
		}
		
		limpa()
		escreva("Média de salários: ", Mat.arredondar(mediaSalario, 2))
		escreva("\nMédia de filhos: ", Mat.arredondar(mediaFilhos,2))
		escreva("\nMaior Salário: ", maiorSalario)
		escreva("\nPercentual de pessoas com ganho até R$100: ", Mat.arredondar(totalPercentual, 2), "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */