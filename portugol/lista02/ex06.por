programa
{
	funcao inicio()
	{
		inteiro idade
		
		escreva("Digite a idade: ")
		leia(idade)
		limpa()

		se(idade>=5 e idade<=7){
			escreva("Você faz parte da categoria Infantil A")
		}
		senao se(idade>=8 e idade <=11){
			escreva("Você faz parte da categoria Infantil B")
		}
		senao se(idade>=12 e idade<=13){
			escreva("Você faz parte da categoria Juvenil A")
		}
		senao se(idade>=14 e idade<=17){
			escreva("Você faz parte da categoria Juvenil B")
		}
		senao{
			escreva("Você faz parte da categoria Adulto")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */