package Lista03;

import java.util.Scanner;

public class Ex02 {
	

	  public static void main(String[] args) {
	    
	    int numero, numerosPares=0, numerosImpares=0;
	    Scanner leia = new Scanner (System.in);

	    for(int x=0;x<10;x++){
	      System.out.printf("Digite um n�mero: ");
	      numero = leia.nextInt();

	      if(numero%2==0){
	        numerosPares++;
	      }
	      if(numero%2==1){
	        numerosImpares++;
	      }
	    }

	     System.out.printf("\nO total de n�meros pares digitados foi: %d",numerosPares );

	     System.out.printf("\nO total de n�meros �mpares digitados foi: %d", numerosImpares);
	  }
	}
