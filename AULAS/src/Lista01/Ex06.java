import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		d = Math.round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		System.out.println("A dist�ncia entre os dois pontos � " +d);

	}

}
