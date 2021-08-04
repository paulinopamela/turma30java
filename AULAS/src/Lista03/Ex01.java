package Lista03;

public class Ex01 {
	public static void main(String args[]) {
		
		int contador;
		
		for(int x=1000; x<=1999;x++) {
			if(x%11==5) {
				contador=x;
				System.out.printf("\n%d", contador);
			}
		}
	}
}
