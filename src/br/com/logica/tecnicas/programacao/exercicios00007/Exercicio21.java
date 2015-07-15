package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicio21 {

	public static void main(String[] args) {
		Exercicio21 exe21 = new Exercicio21();
		exe21.imprimirTodosNumeros();
	}
	
	/**
	 * Faça um programa que leia um número inteiro positivo e mostre todos os números a partir dele até zero.
	 * 
	 * Exemplo 1: numero = 8
	 * 		Mostrar 8 7 6 5 4 3 2 1 0
	 * Exemplo 2: numero = 13
	 * 		Mostrar 13 12 11 10 9 8 7 6 5 4 3 2 1 0
	 */
	public void imprimirTodosNumeros() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
		
		for (int x = n; x >= 0; x--) {
			System.out.print(x + " ");
		}
	}
}