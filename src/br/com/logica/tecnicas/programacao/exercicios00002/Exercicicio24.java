package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio24 {

	public static void main(String[] args) {
		Exercicicio24 exe24 = new Exercicicio24();
		exe24.calcularValorMedio();
	}

	/**
	 * Escreva um programa que leia 200 valores reais e armazene-os em um vetor e informe a seguir, qual a média dos valores positivos e qual a média
	 * dos valores negativos.
	 */
	public void calcularValorMedio() {
		int qn = 5;
		double[] ns = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero real qualquer: "));
			ns[x] = n;
		}
		
		
		double sp = 0, sn = 0, cp = 0, cn = 0;
		for (int x = 0; x < qn; x++) {
			double n = ns[x];
			if (n < 0) {
				sn += n;
				cn++;
			} else {
				sp += n;
				cp++;
			}
		}
		
		System.out.println("Media positiva: " + (sp / cp));
		System.out.println("Media negativa: " + (sn / cn));
	}
}