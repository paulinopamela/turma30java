package Lista03;

import java.util.Scanner;

public class Ex06 {

	  public static void main(String[] args) {
	    
	    int numero, soma=0, media=0, contador=0;
	    Scanner leia = new Scanner(System.in);

	    do{
	      System.out.printf("Digite um n�mero: ");
	      numero = leia.nextInt();

	      if(numero%3==0){
	        contador++;
	        soma = soma+numero;
	        media = soma /contador;
	      }
	    }while(numero!=0);

	   
	    System.out.printf("A m�dia dos n�meros m�ltiplos de 3 foi: %d", media);
	    leia.close();
	  }
	}

