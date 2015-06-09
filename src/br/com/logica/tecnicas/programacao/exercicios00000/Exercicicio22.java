package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.verificarNumeros();
	}

	/**
	 * Faça um programa que leia 10 números positivos obrigatoriamente de 5 algarismos e mostre se eles são pares ou ímpares.
	 */
	public void verificarNumeros() {
		int qn = 10;
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = 0;
			while (n < 10000 || n > 99999) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer de 5 algoritmos para posi\u00e7\u00e3o " + (x + 1) + ":"));
			}
			ns[x] = n;
		}
		
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n != 0 && n % 2 == 1) {
				System.out.println("N\u00famero " + n + " na posi\u00e7\u00e3o " + (x + 1) + " \u00e9 \u00edmpar.");
			} else {
				System.out.println("N\u00famero " + n + " na posi\u00e7\u00e3o " + (x + 1) + " \u00e9 par.");
			}
		}
	}
}