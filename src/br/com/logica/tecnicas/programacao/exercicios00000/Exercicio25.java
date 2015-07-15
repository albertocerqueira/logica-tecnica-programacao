package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.imprimirNumeros();
	}

	/**
	 * Escreva um programa capaz de ler um valor inteiro n que  esteja entre 1 e 9 (O programa deve obrigar o usuário a digitar um valor 
	 * entre 1 e 9). Depois crie a seguinte saída usando dois laços aninhados.
	 * Por exemplo n =5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 */
	public void imprimirNumeros() {
		int n = 10;
		while (n < 0 || n > 9) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero entre 0 e 9:"));
		}
		
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				System.out.print((y + 1) + " ");
			}
			System.out.println("");
		}
	}
}