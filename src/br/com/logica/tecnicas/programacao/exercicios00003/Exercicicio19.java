package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/18
 */
public class Exercicicio19 {

	public static void main(String[] args) {
		Exercicicio19 exe19 = new Exercicicio19();
		exe19.divisoresDeN();
	}

	/**
	 * Escreva um programa que mostre todos os divisores de um valor N positivo (isto é N, obrigatoriamente deve ser maior que zero). 
	 */
	public void divisoresDeN() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
		
		if (n > 0) {
			for (int x = 1; x < n; x++) {
				if (n % x == 0) {
					System.out.println(x);
				}
			}
		}
	}
}