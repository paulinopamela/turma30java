package Lista05;

public class Cachorro extends Animal{
			
	
	private boolean somCachorro;
	
	
	public Cachorro(String nome, int anoNascimento, boolean somCachorro) {
		super(nome, anoNascimento);
		this.somCachorro = somCachorro;
	}


	public boolean isSomCachorro() {
		return somCachorro;
	}

	public void setSomCachorro(boolean somCachorro) {
		this.somCachorro = somCachorro;
	}
	
	
	@Override 
	public void emitirSom() {
		if(somCachorro) {
			System.out.println("Cachorro nervoso: AU! AU! AU! AU!");
		}
		else
		{
			System.out.println("Cachorro na Paz de Jah: au au au au");
		}
		
	}
	
}