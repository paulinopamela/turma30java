package Lista02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		numero = leia.nextInt();

		if(numero==0) {
			System.out.printf("O número digitado é nulo");
		}else if(numero%2==1) {
			System.out.printf("O quadrado do número " +numero+ " é " +Math.round(Math.pow(numero,2)));
		}else if(numero%2==0) {
			System.out.printf("A raíz quadrada do número " +numero+ " é " +Math.round(Math.sqrt(numero)));
		}else if(numero<0) {
			System.out.printf("O número digitado é negativo");
		}
		leia.close();
		
	}

}