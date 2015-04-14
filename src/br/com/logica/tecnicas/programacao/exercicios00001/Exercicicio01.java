package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.vetor15posicoes();
	}
	
	/**
	 * Escreva um programa que armazene 15 números inteiros gerados aleatoriamente em um vetor. Imprima o vetor construído, a soma de todos os
	 * elementos de posição ímpar e a soma de todos os elementos ímpares.
	 */
	public void vetor15posicoes() {
		int[] vetor = new int[15];
		for (int x = 0; x < 15; x++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
			vetor[x] = numero;
		}
		
		int somaNumerosImparVetor = 0, somaPosicosImparVetor = 0;
		for (int x = 0; x < 15; x++) {
			int numero = vetor[x];
			System.out.println(numero + " n\u00famero " + (x + 1) + "° do vetor.");
			if (numero % 2 != 0) {
				somaNumerosImparVetor += numero;
				somaPosicosImparVetor += (x+1);
			}
		}
		System.out.println("A soma dos n\u00fameros impares do vetor é: " + somaNumerosImparVetor);
		System.out.println("A soma das posi\u00e7\u00f5es do vetor de n\u00fameros impares \u00e9: " + somaPosicosImparVetor);
	}
}