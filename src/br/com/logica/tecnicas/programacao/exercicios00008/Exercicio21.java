package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/15
 */
public class Exercicio21 {

	public static void main(String[] args) {
		Exercicio21 exe21 = new Exercicio21();
		exe21.tabuada();
	}
	
	/**
	 * Escreva um programa que leia um número inteiro, calcule e mostre a tabuada desse número de 1 até o número lido. Mostre a tabuada no formato do 
	 * exemplo abaixo. Exemplos: 
	 * 
	 * numero = 5
	 * 1 x 5 = 5 
	 * 2 x 5 = 10 
	 * 3 x 5 = 15
	 * 4 x 5 = 20
	 * 5 x 5 = 25
	 * 
	 * numero = 7
	 * 1 x 7 = 7 
	 * 2 x 7 = 14 
	 * 3 x 7 = 21
	 * 4 x 7 = 28
	 * 5 x 7 = 35
	 * 6 x 7 = 42
	 * 7 x 7 = 49
	 */
	public void tabuada() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero inteiro: "));

		for (int x = 1; x <= n; x++) {
			System.out.println(x + " x " + n + " = " + (x * n));
		}
	}
}