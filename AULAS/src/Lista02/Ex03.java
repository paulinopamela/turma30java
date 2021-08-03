package Lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main (String args[]) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.printf("Você é da categoria Infantil");
		}else if(idade>=15 && idade<=17) {
			System.out.printf("Você é da categoria Juvenil");
		}else if(idade>=18 && idade<=25) {
			System.out.printf("Você é da categoria Adulto");
		}else {
			System.out.printf("Digite uma idade válida! ");
		}
		
		leia.close();
	}
}
