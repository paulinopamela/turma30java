public class contaCorrente extends Conta{
	private int contadorTalao;

	public contaCorrente(int numero, String cliente, int contadorTalao) {
		super(numero, cliente);
		this.contadorTalao = contadorTalao;
	}
}

