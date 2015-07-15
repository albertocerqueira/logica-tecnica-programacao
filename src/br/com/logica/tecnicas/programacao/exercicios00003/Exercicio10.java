package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/14
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.buscarMaiortemperatura();
	}

	/**
	 * Escreva um programa que leia 31 valores de temperatura do mês de Março e os armazenar em um vetor. Depois o programa deverá encontrar e
	 * imprimir a maior temperatura de todo o mês e o dia que isso ocorreu.
	 */
	public void buscarMaiortemperatura() {
		int qn = 31;
		
		double[] ts = new double[qn];
		for (int x = 0; x < qn; x++) {
			double t = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (x + 1) + "° temperatura do m\u00eas de mar\u00e7o: "));
			ts[x] = t;
		}
		
		double m = 0;
		int d = 0;
		for (int x = 0; x < qn; x++) {
			double t = ts[x];
			if (t > m) {
				m = t;
				d = x + 1;
			}
		}
		
		System.out.println("A maior temperatura do m\u00eas \u00e9 " + m + " e ocorreu no dia " + d + ".");
	}
}