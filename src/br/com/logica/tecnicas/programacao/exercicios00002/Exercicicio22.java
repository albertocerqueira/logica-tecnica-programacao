package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.imprimirDiferenca();
	}

	/**
	 * Escrever um programa que leia 2 vetores X[5] e Y[5]. Crie, a seguir, um vetor Z que seja a diferença (subtração) entre X e Y e depois imprima
	 * na tela este vetor Z.
	 */
	public void imprimirDiferenca() {
		int qn = 3;
		
		int[] X = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero do vetor X: "));
			X[x] = n;
		}
		
		int[] Y = new int[qn];
		for (int y = 0; y < qn; y++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (y + 1) + "° n\u00famero do vetor Y: "));
			Y[y] = n;
		}
		
		int[] Z = new int[qn];
		for (int z = 0; z < qn; z++) {
			Z[z] = Y[z] - X[z];
		}
		
		System.out.println("Valores do vetor Z:");
		for (int z = 0; z < qn; z++) {
			System.out.println(Z[z]);
		}
	}
}