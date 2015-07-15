package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicio21 {

	public static void main(String[] args) {
		Exercicio21 exe21 = new Exercicio21();
		exe21.dividirPeloMenorNumeros();
	}

	/**
	 * Faça um programa que leia um vetor (de no máximo 500 posições) de números inteiros e divida todos os seus elementos pelo menor valor do vetor.
	 * Mostre o vetor após os cálculos. 
	 */
	public void dividirPeloMenorNumeros() {
		int qn = 500;
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero qualquer: "));
			ns[x] = n;
		}
		
		int m = ns[0];
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n < m) {
				m = n;
			}
		}
		
		System.out.println("Menor n\u00famero do vetor: " + m);
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			System.out.println(n + " / " + m + " = "  + (n / m));
		}
	}
}