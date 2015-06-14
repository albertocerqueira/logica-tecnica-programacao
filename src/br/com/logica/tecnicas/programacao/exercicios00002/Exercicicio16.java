package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio16 {

	public static void main(String[] args) {
		Exercicicio16 exe16 = new Exercicicio16();
		exe16.multiplicarVetor();
	}

	/**
	 * Faça um programa que leia N elementos (o valor de N deve ser lido) reais em um vetor A e um valor real x. Criar o vetor B contendo os
	 * elementos do vetor A multiplicados por x. (A tem no máximo 100 elementos. Qual o tamanho mínimo de B?). 
	 */
	public void multiplicarVetor() {
		int qn = 101;
		while (qn < 0 || qn > 100) {
			qn = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00fameros do vetor (menor que 100): "));
		}
		
		double[] a = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite " + (x + 1) + "° n\u00famero real qualquer: "));
			a[x] = n;
		}
		
		Integer m = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicador: "));
		
		double[] b = new double[qn];
		for (int x = 0; x < qn; x++) {
			b[x] = a[x] * m;
		}
		
		System.out.println("Vetor multiplicado:");
		for (int x = 0; x < qn; x++) {
			System.out.println(b[x]);
		}
	}
}