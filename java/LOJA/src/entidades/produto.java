package entidades;

public class produto {
	//Atributos
	private String nome;
	private String codigo;
	private double valor;
	private int estoque;

	//Construtores
	public produto(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public produto(String nome, String codigo, double valor, int estoque) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}

	//Encapsulamento - Método
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	

}
