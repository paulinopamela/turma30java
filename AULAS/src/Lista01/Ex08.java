import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		double valorInicial, valorFinal, imposto, distribuicao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica: ");
		valorInicial = leia.nextDouble();

		imposto = Math.round((valorInicial * 0.45));
		distribuicao = Math.round((valorInicial * 0.28)); 

		valorFinal = Math.round((valorInicial + imposto + distribuicao));

		System.out.println("\nCusto do imposto: " + imposto);
		System.out.println("\nCusto de distribuição: " + distribuicao);
		System.out.println("\nValor final: " + valorFinal);

	}

}
