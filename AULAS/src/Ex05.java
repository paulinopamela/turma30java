import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		double media, nota1, nota2, nota3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/ (2 + 3 + 5);
		
		System.out.println("A média ponderada do alune é " +media);

	}

}
