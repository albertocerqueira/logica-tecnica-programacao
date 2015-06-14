package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio15 {

	public static void main(String[] args) {
		Exercicicio15 exe15 = new Exercicicio15();
		exe15.imprimirNumeros();
	}

	/**
	 * Faça um programa que leia N elementos inteiros (o valor de N deve ser lido) de um vetor e um valor de código. Se o código for 1, mostrar o
	 * vetor na ordem direta, se o código for 2, mostrar o vetor na ordem inversa. (O vetor tem no máximo 100 elementos). 
	 */
	public void imprimirNumeros() {
		int qn = 101;
		while (qn < 0 || qn > 100) {
			qn = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00fameros do vetor (menor que 100): "));
		}
		
		double[] ns = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite " + (x + 1) + "° n\u00famero real qualquer: "));
			ns[x] = n;
		}
		
		String c = JOptionPane.showInputDialog("Digite o c\u00f3digo de impress\u00e3o: ");
		
		if (c.equals("1")) {
			for (int x = 0; x < qn; x++) {
				System.out.println(ns[x]);
			}
		} else if (c.equals("2")) {
			for (int x = qn; x > 0; x--) {
				System.out.println(ns[x - 1]);
			}
		}
	}
}