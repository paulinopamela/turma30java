programa
{
	
	funcao inicio()
	{
		cadeia c
		inteiro n, E
		real s, sx
		const real SALARIOBASE = 500.00
		const real HORATRABALHO = 10.00
		const real HORAEXTRA = 20.00
		const inteiro HORARIOBASE = 50
		
		escreva("Qual o seu nome? ")
		leia(c)
		escreva("Quantas horas trabalhadas? ")
		leia(n)
		limpa()
		
		E= 0

		se (n <= HORARIOBASE){
			s = n * HORATRABALHO
			escreva("Total horas trabalhadas: ", n, "hs")
			escreva("\nSalário Total: R$", s)
		}
		senao{
			E = n - HORARIOBASE
			sx = E * HORAEXTRA
			s = SALARIOBASE + sx
			escreva("Total horas trabalhadas: ", n, "hs")
			escreva("\nSalário Total: R$", s)
			escreva("\nSalário Excedente: R$", sx)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */