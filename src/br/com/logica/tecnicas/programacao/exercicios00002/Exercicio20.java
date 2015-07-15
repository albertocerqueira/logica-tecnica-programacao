package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.imprimirNumerosDosIndices();
	}

	/**
	 * Faça um programa que leia 30 valores inteiros para um vetor A, e em seguida construa um vetor P formado pelos elementos de índices pares de A.
	 * Exemplo: Se A = {1, 3, 6, 7, 8, 10}, então, P = {1, 6, 8}.
	 */
	public void imprimirNumerosDosIndices() {
		int qn = 30;
		int m = qn / 2;
		int[] a = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero qualquer: "));
			a[x] = n;
		}
		
		int[] p = new int[qn];
		for (int x = 0; x < qn; x++) {
			if (x % 2 == 0) {
				p[--m] = a[x];
			}
		}
		
		System.out.println("N\u00fameros de \u00cdndices pares: ");
		for (int x = 0, y = (qn / 2); x < y; x++) {
			System.out.println(p[x]);
		}
	}
}