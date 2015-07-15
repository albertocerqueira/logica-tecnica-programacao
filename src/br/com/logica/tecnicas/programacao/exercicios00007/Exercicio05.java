package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/31
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.armazenarProdutos();
	}
	
	/**
	 * Construa um programa cuja função principal deve ler a descrição de 50 produtos de um supermercado, guardar em uma array e chamar a função 
	 * mostraProdutos(), passando o array como parâmetro. Essa função deve mostrar os produtos na ordem inversa que foram digitados. 
	 */
	public void armazenarProdutos() {
		int DESCRICAO = 3;
		String produtos[] = new String[DESCRICAO];
		for (int x = 0; x < DESCRICAO; x++) {
			String produto = JOptionPane.showInputDialog("Digite a descri\u00e7\u00e3o do " + (x + 1) + "° produto:");
			produtos[x] = produto;
		}
		mostraProdutos(produtos);
	}
	
	public void mostraProdutos(String[] produtos) {
		System.out.println("Descri\u00e7\u00e3o na ordem Inversa:");
		for (int x = produtos.length - 1; x >= 0; x--) {
			System.out.println(produtos[x]);
		}
	}
}