package appEcommerce.repository;

public interface EcommerceRepository {
	//crud
	
	 void criarConta();
	 void listarProdutos();
	 void atualizarConta();
	 void excluirConta();
	
	//metodos
	
	 void adicionarProdutoCarrinho(int codigo);
	 void removerProdutoCarrinho();
	

}
