programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a, b, c, d, f, g, x, y

		escreva ("Qual o valor de A? ")
		leia (a)
		escreva ("Qual o valor de B? ")
		leia (b)
		escreva ("Qual o valor de C? ")
		leia (c)
		escreva ("Qual o valor de D? ")
		leia (d)
		escreva ("Qual o valor de E? ")
		leia (g)
		escreva ("Qual o valor de F? ")
		leia (f)

		x = Matematica.arredondar(((c*g) - (b*f)) / ((a*g) - (b*d)), 2)
		y = Matematica.arredondar(((a*f) - (c*d)) / ((a*g) - (b*d)), 2)

		escreva("\nO valor de X é ", x, "\n")
		escreva("O valor de Y é ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */