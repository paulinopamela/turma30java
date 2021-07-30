programa
{
	
	funcao inicio()
	{
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
		
		inteiro anos, meses, dias, resultado
		
		escreva ("Quantos anos você tem? ")
		leia (anos)
		escreva ("E quantos meses? ")
		leia (meses)
		escreva ("E quantos dias? ")
		leia (dias)

		resultado = (anos*365) + (meses*30) + dias

		escreva ("Você tem um total de ", resultado, " dias de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */