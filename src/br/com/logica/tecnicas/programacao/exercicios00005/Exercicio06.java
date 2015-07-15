package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio06 {

	public static void main(String[] args) {
		Exercicio06 exe06 = new Exercicio06();
		exe06.imprimirDivisores();
	}
	
	/**
	 * Faça um programa que leia um número N e escreva uma lista do seus divisores. 
	 */
	public void imprimirDivisores() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero:"));
		System.out.println("Seus divisores s\u00e3o:");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}