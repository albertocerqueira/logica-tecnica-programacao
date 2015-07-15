package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.verificarNumeros();
	}

	/**
	 * Faça um programa que leia 10 números positivos, obrigatoriamente de 5 algarismos e mostre se eles são pares ou ímpares. No final do programa
	 * deve ser mostrado quantos números são pares, quantos são ímpares e quantos números foram digitados (não se esqueça de incluir aqueles que
	 * foram digitados e não valeram, pois, não tinham 5 algarismos).
	 */
	public void verificarNumeros() {
		int q = 0;
		int qn = 10;
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = 0;
			while (n < 10000 || n > 99999) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer de 5 algoritmos para posi\u00e7\u00e3o " + (x + 1) + ":"));
				q++;
			}
			ns[x] = n;
		}
		
		int p = 0;
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n != 0 && n % 2 == 1) {
				System.out.println("N\u00famero " + n + " na posi\u00e7\u00e3o " + (x + 1) + " \u00e9 \u00edmpar.");
			} else {
				System.out.println("N\u00famero " + n + " na posi\u00e7\u00e3o " + (x + 1) + " \u00e9 par.");
				p++;
			}
		}
		
		if (p == 1) {
			System.out.println("Temos 1 n\u00famero par e 9 n\u00fameros \u00edmpares.");
		} else if (p == 9) {
			System.out.println("Temos 9 n\u00fameros pares e 1 n\u00famero \u00edmpar.");
		} else {
			System.out.println("Temos " + p + " n\u00fameros pares e " + (3 - p) + " n\u00fameros \u00edmpares.");
		}
		
		System.out.println("Foi digitado " + q + " n\u00fameros.");
	}
}