import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o valor de A? ");
		a = leia.nextDouble();
		System.out.println("Qual o valor de B? ");
		b = leia.nextDouble();
		System.out.println("Qual o valor de C? ");
		c = leia.nextDouble();
		System.out.println("Qual o valor de D? ");
		d = leia.nextDouble();
		System.out.println("Qual o valor de E? ");
		e = leia.nextDouble();
		System.out.println("Qual o valor de F? ");
		f = leia.nextDouble();

		x = Math.round(((c*e) - (b*f)) / ((a*e) - (b*d)));
		y = Math.round(((a*f) - (c*d)) / ((a*e) - (b*d)));

		System.out.println("\nO valor de X é ", x, "\n");
		System.out.println("O valor de Y é ", y);

	}

}
