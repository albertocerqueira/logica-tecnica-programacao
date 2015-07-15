package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.imprimirIndicesPares();
	}

	/**
	 * Faça um programa que leia 30 valores inteiros para um vetor A, e em seguida construa um vetor P formado pelos índices dos elementos pares de A.
	 * Exemplo: Se A = {1, 3, 6, 7, 8, 10}, então, P = {2, 4, 5}.
	 */
	public void imprimirIndicesPares() {
		int qn = 30, c = 0, t = 0;
		int[] a = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero qualquer: "));
			if (n % 2 == 0) {
				c++;
			}
			a[x] = n;
		}
		t = c;
		
		int[] p = new int[c];
		for (int x = 0; x < qn; x++) {
			int n = a[x];
			if (n % 2 == 0) {
				p[--c] = x;
			}
		}
		
		System.out.println("\u00cdndices de n\u00fameros pares: ");
		for (int x = 0; x < t; x++) {
			System.out.println(p[x]);
		}
	}
}