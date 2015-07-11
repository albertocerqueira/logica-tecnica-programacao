package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.imprimirDivisoresPorTres();
	}
	
	/**
	 * Faça um programa que leia um número inteiro positivo e mostre todos os números começando em  3 até esse número que são divisíveis por três.
	 * 
	 * Exemplo 1: numero = 20
	 * 		Mostrar 3 6 9 12 15 18
	 * Exemplo 2: numero = 30
	 * 		Mostrar 3 6 9 12 15 18 21 24 27 30
	 */
	public void imprimirDivisoresPorTres() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
		
		for (int x = 0; x <= n; x++) {
			if (x % 3 == 0 && x != 0) {
				System.out.print(x + " ");
			}
		}
	}
}