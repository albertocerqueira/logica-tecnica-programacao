package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.separarIndiceVetor();
	}
	
	/**
	 * Escreva que deve ler 10 valores inteiros e armazená-los em um vetor A. Em seguida, a função deve calcular e imprimir a média dos elementos do
	 * vetor e a quantidade de elementos do vetor que são maiores que a média.
	 */
	public void separarIndiceVetor() {
		int[] exemplo = new int[10];
		int soma=0, cont = 0;
		float media;
		System.out.println("Informe 10 valores inteiros para inicializar o vetor:");
		for (int i = 0; i < 10; i++) {
			Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° n\u00famero do vetor:"));
			exemplo[i] = n;
			soma = soma + exemplo[i];
		}
		media = ((float)soma)/10;
		for (int i = 0; i < 10; i++) {
			if(exemplo[i] > media) {
				cont++;
			}
		}
		System.out.println("A m\u00e9dia dos elementos do vetor \u00e9: " + media);
		System.out.println("A quatidade de elementos maiores que a media \u00e9: " + cont);
	}
}