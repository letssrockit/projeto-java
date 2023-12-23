package appEcommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import appEcommerce.util.Cores;
import appEcommerce.controller.*;
import appEcommerce.model.*;
import appEcommerce.repository.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		EcommerceController ecommerceController = new EcommerceController();

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);

			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("               LOJA DA LULUZINHA                ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("          1 - Criar conta                       ");
			System.out.println("          2 - Listar produtos            ");
			System.out.println("          3 - Adicionar ao carrinho  ");
			System.out.println("          4 - Atualizar dados da conta          ");
			System.out.println("          5 - Apagar a conta                  ");
			System.out.println("          6 - Remover do carrinho                              ");
			System.out.println("          7 - Sair                 ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("\nEntre com a opção desejada:                   ");
			System.out.println("                                                " + Cores.TEXT_RESET);

			opcao = leia.nextInt();


			if (opcao == 7) {
				System.out.println("\nLoja da Luluzinha agradece sua visita!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {

			case 1:
				ecommerceController.criarConta();

				keyPress();
				break;

			case 2:
				System.out.println("Listar produtos\n\n");
				ecommerceController.listarProdutos();

				System.out.println("1 - Planner Diário");
				System.out.println("2 - Planner Semanal");
				System.out.println("3 - Planner Mensal");
				System.out.println("4 - Planner Anual");

				keyPress();
				break;

			case 3:
			    System.out.println("Adicionar ao carrinho");
			    
			    System.out.println("Escolha um produto:");
			    
			    
			    System.out.println("1 - Planner Diário");
			    System.out.println("2 - Planner Semanal");
			    System.out.println("3 - Planner Mensal");
			    System.out.println("4 - Planner Anual");

			    int produtoEscolhido = leia.nextInt();
			    
			    ecommerceController.adicionarProdutoCarrinho(opcao);

			    keyPress();
			    break;


			case 4:
				System.out.println("Atualizar dados da conta\n\n");

				ecommerceController.atualizarConta();

				keyPress();
				break;

			case 5:
				System.out.println("Apagar a conta\n\n");

				ecommerceController.excluirConta();

				keyPress();
				break;

			case 6:
				System.out.println("Remover do Carrinho\n\n");
				ecommerceController.removerProdutoCarrinho();

				keyPress();
				break;

			default:
				System.out.println("\nOpção inválida\n");

				keyPress();
				break;
			}
		}

	}

	private static void sobre() {
		System.out.println("************************************************");
		System.out.println("Projeto desenvolvido por: Leticia Santana Rocha");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/letssrockit");
		System.out.println("************************************************");

	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		try {
			Scanner leia = new Scanner(System.in);
			leia.nextLine();
		} catch (Exception e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}

	}
}
