package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/26
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.criarMatrizInvertida();
	}
	
	/**
	 * Construa um programa para ler a descrição de 10 produtos de um supermercado, armazenar em uma matriz e mostrar os produtos na ordem inversa 
	 * que foram digitados.
	 */
	public void criarMatrizInvertida() {
		int totalProdutos = 10;
		String[][] produtos = new String[1][10];
		for (int x = 0 ; x < totalProdutos ; x++) {
			String produto = JOptionPane.showInputDialog("Digite o " + (x + 1) + "° produto:");
			produtos[0][x] = produto;
		}

		System.out.println("Inverso:");
		for (int x = totalProdutos - 1 ; x >= 0 ; x--) {
			System.out.println(produtos[0][x]);
		}
	}
}