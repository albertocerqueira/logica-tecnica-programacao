package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.imprimirDivisoresPorSetePares();
	}
	
	/**
	 * Faça um programa que leia um número inteiro positivo e mostre os números a partir de 1 até esse número que são simultaneamente pares e 
	 * divisíveis por 7.
	 * 
	 * Exemplo 1: número = 42
	 * 		Mostrar 14 28 42
	 * Exemplo 2: número = 100
	 * 		Mostrar 14 28 42 56 70 84 98
	 */
	public void imprimirDivisoresPorSetePares() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
		
		for (int x = 0; x <= n; x++) {
			if (x % 2 == 0 && x % 7 == 0 && x != 0) {
				System.out.print(x + " ");
			}
		}
	}
}