package appEcommerce.model;

public abstract class Produto extends Informacoes{

	
	public Produto(String produto, float preco, int codigo, String nome, String email, long telefone) {
		super(produto, preco, codigo, nome, email, telefone);
		
		
	}

	public void mostrarInformacoes() {
        System.out.println("Produto: " + produto);
        System.out.println("Valor: " + preco);
        System.out.println("Código: " + codigo);
	
	}	

}
