package appEcommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import appEcommerce.repository.EcommerceRepository;
import appEcommerce.model.Conta;
import appEcommerce.model.Produto;
import java.util.Iterator;

public class EcommerceController implements EcommerceRepository {

	private List<Produto> listaProdutos = new ArrayList<>();
	private List<Conta> listaClientes = new ArrayList<>();
	private List<Produto> carrinho = new ArrayList<>();

	Scanner leia = new Scanner(System.in);

	@Override
	public void criarConta() {
		System.out.println("Digite seu nome: ");
		leia.nextLine();
		System.out.println("Digite seu email: ");
		leia.nextLine();
		System.out.println("Digite seu telefone: ");
		leia.nextLong();

		System.out.println("\nConta cadastrada com sucesso!");

	}

	public void listarProdutos() {
		System.out.println("Lista de Produtos:");

		for (Produto produto : listaProdutos) {

			System.out.println("Código: " + produto.getCodigo() + ", Nome: " + produto.getNome() + ", Preço: "
					+ produto.getPreco());

		}

	}

	@Override
	public void atualizarConta() {
		System.out.println("Digite seu novo nome: ");
		String novoNome = leia.next();
		System.out.println("Digite seu novo email: ");
		String novoEmail = leia.next();
		System.out.println("Digite seu novo telefone: ");
		long novoTelefone = leia.nextLong();
		
		System.out.println("Conta atualizada com sucesso! ");

	}

	@Override
	public void excluirConta() {
	    System.out.println("Digite o email da conta a ser excluída: ");
	    String emailExcluir = leia.next();
	    leia.nextLine();

		 Iterator<Conta> iterator = listaClientes.iterator();
		    while (iterator.hasNext()) {
		        Conta conta = iterator.next();
		        if (conta.getEmail().equals(emailExcluir)) {
		            iterator.remove();
		            System.out.println("Conta excluída com sucesso!");
		            return;
		        }
		}
		    System.out.println("Conta não encontrada");

	}

	@Override
	public void adicionarProdutoCarrinho(int codigo) {
	    Produto produtoEscolhido = null;
	    for (Produto produto : listaProdutos) {
	        if (carrinho.contains(produtoEscolhido)) {
	        	System.out.println("O produto já está em seu carrinho!");
	            break;
	        }
	    }if (!carrinho.contains(produtoEscolhido)) {
	        carrinho.add(produtoEscolhido);
	        System.out.println("O produto foi adicionado com sucesso!");
	    } else {
	        System.out.println("O produto " + codigo + " não foi encontrado.");
	    }
	}


	public void removerProdutoCarrinho() {
	    System.out.println("Digite o produto a ser excluído: ");
	    int produtoExcluir = leia.nextInt();

	    if (carrinho.isEmpty()) {
	        System.out.println("Carrinho vazio. Nenhum produto para remover.");
	        return;
	    }

	    if(produtoExcluir <=4) {
	            System.out.println("Produto removido com sucesso!");
	            return;
	        }else {
	        	System.out.println("Produto não encontrado no carrinho.");
	        }
	        }
	    }
	    

