package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calcularMediaNumeros();
	}
	
	/**
	 * Faça um programa na que calcule a média dos números digitados pelo usuário. Encerre a leitura se o usuário digitar zero (0).	
	 */
	public void calcularMediaNumeros() {
		int s = 0, q = 0;
		while (true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
			if (n != 0) {
				s += n;
				q++;
			} else {
				break;
			}
		}
		
		System.out.println("A m\u00e9dia dos n\u00fameros digitados \u00e9 " + (s / q) + ".");
	}
}