package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio06 {

	public static void main(String[] args) {
		Exercicio06 exe06 = new Exercicio06();
		exe06.verificarVetor();
	}
	
	/**
	 * Fazer um programa para ler um vetor de inteiros positivos de 50 posições. Imprimir a quantidade de números pares e de multiplos de 5.
	 */
	public void verificarVetor() {
		int[] numeros = new int[50];
		for (int x = 0; x < 50; x++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + " n\u00famero do vetor:"));
	    	numeros[x] = numero;	
		}	
		System.out.println("Os n\u00fameros m\u00faltiplos de 5 e pares deste vetor s\u00e3o:");
		for (int x = 0; x < 50; x++) {
			int numero = numeros[x];
		    if (numero % 2 == 0 || numero % 5 == 0) {
		    	System.out.println(numero);
			}
		}
	}
}