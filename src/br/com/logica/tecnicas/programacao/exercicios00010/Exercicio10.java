package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/21
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.consultarFinanciamento();
	}
	
	/**
	 * Um número inteiro N é dito primo se apenas for divisível por 1 e por ele mesmo (Por definição, o 1 não é primo). Escreva um programa que leia 
	 * um número N positivo e maior que 1 e informe se o número é primo ou não. 
	 * 
	 * Exemplos:
	 * • 2 é primo, pois, há 2 divisores: o 1 e o 2
	 * • 3 é primo, pois há 2 divisores: o 1 e o 3
	 * • 15 não é primo, pois há 4 divisores: o 1, o 3, o 5 e o 15
	 * • 16 não é primo, pois há 5 divisores: o 1, o 2, o 4, o 8 e o 16
	 */
	public void consultarFinanciamento() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));;
		int c = 1, p = 0;
		if (n > 1) {
			do {
				c++;
				if (n == c) {
					p = 1;
				}
			} while(n % c != 0);
			
			if (p == 1) {
				System.out.println("Primo");
			} else {
				System.out.println("N\u00e3o primo");
			}
		}
	}
}