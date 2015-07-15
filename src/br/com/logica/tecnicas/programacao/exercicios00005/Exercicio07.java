package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Exercicio07 exe07 = new Exercicio07();
		exe07.calcularSomaDaSequencia();
	}
	
	/**
	 * Faça um programa que leia um número N e a seguir N números e escreva a sua soma. 
	 */
	public void calcularSomaDaSequencia() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero:"));
		int soma = 0;
		for (int i = 0; i < n; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° n\u00famero da sequ\u00eancia:"));
			soma += numero;
		}
		System.out.println("A soma da sequ\u00eancia \u00e9: " + soma);
	}
}