import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		double a, b, c, r, s, d;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		r= Math.pow((a+b),2);
				s= Math.pow((b+c), 2);
				d= (r+s)/2;

		System.out.println("O resultado da express�o D= R+S/2 � " +d);
	}

}
