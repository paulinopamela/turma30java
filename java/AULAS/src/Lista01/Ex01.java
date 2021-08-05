package Lista01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main (String[] args) {
		int anos, meses, dias, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		System.out.println("E quantos meses? ");
		meses = leia.nextInt();
		System.out.println("E quantos dias? ");
		dias = leia.nextInt();

		resultado = (anos*365) + (meses*30) + dias;

		System.out.print("Você tem um total de " +resultado+ " dias de vida." );
		leia.close();
		
	}

}