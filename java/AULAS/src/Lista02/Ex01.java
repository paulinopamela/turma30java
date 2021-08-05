package Lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		
		System.out.printf("Digite o primeiro valor: ");
		numero1 = leia.nextInt();
		System.out.printf("Digite o segundo valor: ");
		numero2 = leia.nextInt();
		System.out.printf("Digite o terceiro valor: ");
		numero3 = leia.nextInt();
		
		if(numero1>numero2 && numero1>numero3){
			System.out.printf("O maior número digitado foi %d", numero1);
		}else if(numero2>numero1 && numero2>numero3){
			System.out.printf("O maior número digitado foi %d", numero2);
		}else if(numero3>numero1 && numero3>numero2){
			System.out.printf("O maior número digitado foi %d", numero3);
		}
		leia.close();
	}
}