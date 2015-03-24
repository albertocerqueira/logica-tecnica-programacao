package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.somaNmais5();
	}

	/**
	 *  Faça um programa em C que leia um número N calcule e escreva a seguinte soma com N 
	 *  termos: S = 1/10 + 2/15 + 3/20 + 4/25 + ...
	 */
	public void somaNmais5() {
		double soma = 0, contador = 0;

		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));

		for (int x = 0; x < n; x++) {
			contador++;
			soma += (contador / ((contador * 5) + 5 ));
		}
		System.out.println("Na sequ\u00eancia  S = 1/10 + 2/15 + 3/20 + 4/25 + .. o n\u00famero " + n + ".\nTem como resultado " + soma + ".");
	}
}
