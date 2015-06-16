package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/15
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.pesquisarIdades();
	}

	/**
	 * Escreva um programa que leia 7 números reais e os armazenar em um vetor. Depois seu programa deverá calcular e imprimir todas as diferenças
	 * entre dois elementos consecutivos deste vetor. O programa também, deverá encontrar e imprimir a maior diferença entre dois elementos
	 * consecutivos deste vetor. 
	 * Dica: Trate sempre as diferenças em valor absoluto, ou seja, se for negativo transforme-o em positivo. 
	 */
	public void pesquisarIdades() {
		int qn = 7;
		
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero qualquer: "));
			ns[x] = n;
		}
		
		int m = 0;
		for (int x = 0; x < qn; x++) {
			if (x != (qn - 1)) {
				int n1 = ns[x];
				if (n1 < 0) {
					n1 = n1 * -1;
				}
				
				int n2 = ns[x + 1];
				if (n2 < 0) {
					n2 = n2 * -1;
				}
				
				int n3 = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + n3);
				
				if (n3 > m) {
					m = n3;
				}
			}
		}
		
		System.out.println("O maior n\u00famero \u00e9: " + m);
	}
}