package Lista05;

public class Cavalo extends Animal{
	
	private boolean somCavalo;
	
	public Cavalo(String nome, int anoNascimento, boolean somCavalo) {
		super(nome, anoNascimento);
		this.somCavalo = somCavalo;
	}

	public boolean isSomCavalo() {
		return somCavalo;
	}

	public void setSomCavalo(boolean somCavalo) {
		this.somCavalo = somCavalo;
	}
	
	
	@Override 
	public void emitirSom() {
		if(somCavalo) {
			System.out.println("HIIN IN IN HINNIR!!");
		}
		else
		{
			System.out.println("pruprupruuuu");
		}
		
	}

}