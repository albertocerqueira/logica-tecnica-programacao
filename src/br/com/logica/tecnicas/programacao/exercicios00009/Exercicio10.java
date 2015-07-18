package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/17
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.verificacaoFibonacci();
	}
	
	/**
	 * Escreva um programa que mostre a série de Fibonacci até um valor digitado pelo usuário. Na série de Fibonacci, por definição, o primeiro termo 
	 * e o segundo valem ambos 1. Do terceiro termo em diante, o novo elemento da seqüência é gerado a partir da soma dos dois elementos anteriores.
	 * 
	 * Exemplos: 
	 * • Número digitado = 45
	 * 		Série de Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, 34
	 * • Número digitado = 200
	 * 		Série de Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	 */
	public void verificacaoFibonacci() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
		int f1 = 0, f2 = 1, s = 0;
		while (s < n) {
			System.out.print(f2 + " ");
			s = f1 + f2;
			f1 = f2;
			f2 = s;
		}
	}
}