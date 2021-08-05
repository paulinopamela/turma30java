package Lista01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int idade, anos, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem?");
		idade = leia.nextInt();
		
		anos = idade/365;
		meses = (idade%365) / 30;
		dias = (idade%365) % 30;
		
		System.out.println("Você tem "+anos+ " anos, " +meses+ " meses e " +dias+ " dias.");
		leia.close();
	}

}