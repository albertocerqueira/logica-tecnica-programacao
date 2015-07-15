package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/25
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Exercicio03 exe03 = new Exercicio03();
		exe03.somaNezimoTermo();
	}

	/**
	 * Faça um programa que leia um número N e calcule e escreva o n-ézimo termo da série: 1, 2, 4, 7, 11, ...
	 */
	public void somaNezimoTermo() {
		int soma=1;
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));

		for (int x = 0; x < n; x++) {
			soma = soma + (x + 1);
		}
		System.out.println("Na sequ\u00eancia 1, 2, 4, 11, 16... o n\u00famero " + n + " seu n-\u00e9zimo na ordem eh  " + soma + ".");
	}
}