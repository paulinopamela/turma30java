programa
{
	inclua biblioteca Matematica
	
	/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
	D= R+S/2, onde R=(A+B)² e S=(B+C)²*/
	
	funcao inicio()
	{
		real a, b, c, r, s, d

		escreva ("Digite o valor de A: ")
		leia(a)
		escreva ("Digite o valor de B: ")
		leia(b)
		escreva ("Digite o valor de C: ")
		leia(c)

		r= Matematica.potencia((a+b),2)
		s= Matematica.potencia((b+c), 2)
		d= (r+s)/2

		escreva ("O resultado da expressão D= R+S/2 é ", d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */