package Lista03;

import java.util.Scanner;

public class Ex05 {

	  public static void main(String[] args) {

	    int numero, soma=0;
	    Scanner leia = new Scanner(System.in);

	    do{
	      System.out.printf("Digite um número: ");
	      numero = leia.nextInt();

	      soma = soma + numero;
	    }while(numero!=0);

	    System.out.printf("\nO total dos números digitados foi: %d", soma);
	    leia.close();
	  }
	}

