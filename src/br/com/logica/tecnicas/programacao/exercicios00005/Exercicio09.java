package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.calcularMedia();
	}
	
	/**
	 * Faça um programa que leia dois números M e N e escreva todos os inteiros entre eles. 
	 */
	public void calcularMedia() {
		int n = 0, soma = 0, quantidade = 0;
		do {
			soma += n;
			quantidade++;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		} while(n != -1);
		System.out.println("A media dos n\u00fameros digitados foi " + (soma / (quantidade - 1)) + ".");
	}
}