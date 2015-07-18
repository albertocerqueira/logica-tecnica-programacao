package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/18
 */
public class Exercicio13 {

	public static void main(String[] args) {
		Exercicio13 exe13 = new Exercicio13();
		exe13.converterParaBinario();
	}
	
	/**
	 * Um número inteiro positivo entre 0 e 255 pode ser facilmente convertido para binário de 8 bits, conforme exemplo abaixo do próximo slide.
	 * Analise a figura, encontre o algoritmo e escreva um programa capaz de ler um valor inteiro maior que zero e convertê-lo para binário.
	 * 
	 * 103 / 2
	 * 	1	51 / 2
	 * 		1	25 / 2
	 * 			1	12 / 2
	 * 				0	6 / 2
	 * 					0	3 / 2
	 * 						1	1 / 2
	 * 							1	0
	 * 
	 * 103 decimal = 1100111
	 */
	public void converterParaBinario() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero entre 0 e 255 para conver\u00e7\u00e3o em bin\u00e1rio:: "));

		int q = 0;
		int[] b = new int[8];
		while (n != 0) {
			b[q++] = n % 2;
			n = n / 2;
		}
		
		System.out.print("Valor em bin\u00e1rio ");
		for (int x = b.length - 1; x >= 0; x--) {
			System.out.print(b[x]);
		}
	}
}