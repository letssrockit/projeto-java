package appEcommerce.model;

public abstract class Conta extends Informacoes{



	public Conta(String produto, float preco, int codigo, String nome, String email, long telefone) {
		super(produto, preco, codigo, nome, email, telefone);
	}

	public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
	
	}	
}
