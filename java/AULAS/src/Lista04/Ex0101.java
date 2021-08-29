package Lista04;

public class Ex0101 {

	public static void main(String[] args) {
		
			Ex0102 cliente1 = new Ex0102();
			
			cliente1.nome = "Pamela";
			cliente1.cpf = "XXX.XXX.XXX.XX";
			cliente1.email = "paulinopamela@protonmail.com";
			cliente1.anoNascimento = 1993;
			cliente1.telefone = 941759292;
			cliente1.genero = 'F';
			
			cliente1.mostraNome();
			cliente1.mostraCpf();
			cliente1.mostraEmail();
			cliente1.mostraAnoNascimento();
			cliente1.mostraTelefone();
			cliente1.mostraGenero();
			
	}

}
