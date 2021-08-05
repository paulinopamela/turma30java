package Lista01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int tempo, horas, minutos, segundos; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento? ");
		tempo = leia.nextInt();
		
		horas = tempo/3600;
		minutos = (tempo%3600) / 60;
		segundos = (tempo%3600) % 60;
		
		System.out.println("O evento durou " +horas+ " horas, " +minutos+ " minutos e " +segundos+ " segundos.");
		leia.close();
	}

}