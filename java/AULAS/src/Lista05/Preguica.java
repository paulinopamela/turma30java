package Lista05;

public class Preguica extends Animal{
	
		private boolean somPreguica;
		

		public Preguica(String nome, int anoNascimento, boolean somPreguica) {
			super(nome, anoNascimento);
			this.somPreguica = somPreguica;
		}


		public boolean isSomPreguica() {
			return somPreguica;
		}

		public void setSomPreguica(boolean somPreguica) {
			this.somPreguica = somPreguica;
		}
		
		@Override 
		public void emitirSom() {
			if(somPreguica) {
				System.out.println("....A!...E!...MEEEE");
			}
			else
			{
				System.out.println(".....................");
			}
			
		}

}