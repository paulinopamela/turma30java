import java.util.Locale;
import java.util.Scanner;

public class Conversor {
	
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		double c = 0, f;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
				
		System.out.println("Digite uma temperatura em graus Celsius e pressione ENTER: ");
		
		f = - (9*c + 160)/5;
		
		System.out.println("A temperatura em graus Fahrenheit é: \", f" +f);
		
	}
	

}
