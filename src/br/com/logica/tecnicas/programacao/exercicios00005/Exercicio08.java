package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.imprimirIntervaloDeNumeros();
	}
	
	/**
	 * Faça um programa que leia dois números M e N e escreva todos os inteiros entre eles. 
	 */
	public void imprimirIntervaloDeNumeros() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero:"));
		for (int i = (n1 + 1); i < n2; i++) {
			System.out.print(i + " ");
		}
	}
}