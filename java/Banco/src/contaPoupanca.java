
public class contaPoupanca extends Conta{

	private int diaAniversarioPoupanca;
	
	public contaPoupanca(int numero, String cliente, int diaAniversarioPoupanca) {
		super(numero, cliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
}
