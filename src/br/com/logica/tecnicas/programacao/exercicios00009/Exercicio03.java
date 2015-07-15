package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/06
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Exercicio03 exe03 = new Exercicio03();
		exe03.imprimirNumerosAleatorios();
	}
	
	/**
	 * Escreva um programa que leia 15 números inteiros e os armazene em um vetor. Imprima todos os elementos do vetor na mesma linha, apenas 
	 * separados por um espaço. Imprima na tela os elementos do vetor na ordem inversa, imprimindo um elemento por linha.
	 */
	public void imprimirNumerosAleatorios() {
		int QUANTIDADE = 15;
		int[] ns = new int[QUANTIDADE];
		for (int x = 0; x < QUANTIDADE; x++) {
			ns[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero:"));
		}
		
		System.out.println("Mesma linha:");
		for (int x = 0; x < QUANTIDADE; x++) {
			System.out.print(ns[x] + " ");
		}
		System.out.println("\nOrdem inversa:");
		for (int x = QUANTIDADE - 1; x >= 0; x--) {
			System.out.println(ns[x]);
		}
	}
}