package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.separarIndiceVetor();
	}
	
	/**
	 * Escreva um programa que leia 20 valores inteiros e armazene-os em um vetor A. Em seguida construa 2 vetores, B e C, tais que o vetor B seja 
	 * formado pelos elementos de índice ímpar de A e o vetor C pelos elementos de índice par de A.
	 */
	public void separarIndiceVetor() {
		int[] VetorA = new int[20];
		int[] VetorB = new int[20];
		int[] VetorC = new int[20];
		int i = 0, j = 0, k = 0;
		System.out.println("Informe 20 valores inteiros para inicializar o vetor:");
		while (i < 20) {
			Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° n\u00famero:"));
			VetorA[i] = n;
			if (i % 2 == 0) {
				VetorB[j] = VetorA[i];
				j++;
			} else {
				VetorC[k] = VetorA[i];
				k++;
			}
			i++;
		}
		System.out.println("Escrita dos vetores constru\u00eddos:");
		System.out.println("Vetor B:");
		for (i = 0 ; i < j; i++) {
			System.out.println(VetorB[i]);
		}
		System.out.println("Vetor C:");
		for (i = 0 ; i < k; i++) {
			System.out.println(VetorC[i]);
		}
	}
}