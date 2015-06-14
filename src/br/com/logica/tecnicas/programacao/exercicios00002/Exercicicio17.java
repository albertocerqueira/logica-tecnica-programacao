package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.imprimirNumerosMultiplosDe3();
	}

	/**
	 * Faça um programa que leia N elementos inteiros (o valor de N deve ser lido), escreva um programa que imprima todos os múltiplos de 3 que estão
	 * contidos no vetor. (O vetor tem no máximo 50 elementos). 
	 */
	public void imprimirNumerosMultiplosDe3() {
		int qn = 51;
		while (qn < 0 || qn > 50) {
			qn = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00fameros do vetor (menor que 100): "));
		}
		
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (x + 1) + "° n\u00famero qualquer: "));
			ns[x] = n;
		}
		
		System.out.println("Multiplos de 3:");
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n % 3 == 0) {
				System.out.println(n);
			}
		}
	}
}