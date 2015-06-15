package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio12 {

	public static void main(String[] args) {
		Exercicicio12 exe12 = new Exercicicio12();
		exe12.divisores();
	}
	
	/**
	 * Faça um programa capaz de ler 15 números obrigatoriamente positivos e mostre todos os seus divisores.
	 */
	public void divisores() {
		int qn = 3;
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = -1;
			while (n < 0) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero positivo:"));
			}
			ns[x] = n;
		}
		
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			System.out.print("Divisores de " + n + " s\u00e3o: ");
			for (int y = 1; y <= n; y++) {
				if (n % y == 0) {
					if (y == n) {
						System.out.print(y + " ");
					} else {
						System.out.print(y + ", ");
					}
				}
			}
			System.out.println("");
		}
	}
}