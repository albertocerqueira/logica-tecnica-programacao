package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.criarMatriz();
	}
	
	/**
	 * Parte A - Escreva um programa capaz de ler um número inteiro entre 1.000 e 99.999. Depois seu programa deverá ser capaz de preencher um vetor 
	 * de cinco posições com cada algarismo do número, usando a função int2vet(). Onde, int2vet(recebe o número lido e o vetor por parâmetro. Por 
	 * exemplo, se o número lido for 32765 então v[5] = {3,2,7,6,5}.
	 * OBSERVAÇÃO: É mais fácil preencher da última para a primeira posição. 
	 * Parte B - Escreva um programa capaz de ler 5 números inteiros entre 1.000 e 99.999 e armazená-los num vetor de inteiros. Depois seu programa 
	 * deverá ser capaz de preencher uma matriz 5x5 de inteiros com cada linha representando um dos elementos do vetor e cada coluna com um algarismo
	 * do número lido, usando a função vet2mat(), sendo que vet2mat() recebe por parâmetro a matriz e o vetor resultado. 
	 * OBSERVAÇÃO: use a função int2vet() construída na parte A.
	 */
	public void criarMatriz() {
		int[][] matriz = new int[5][5];
		for (int x = 0; x < 5; x++) {
			Integer n = 0;
			int[] array = new int[5];
			do {
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero de 5 caracteres:"));
			} while (n < 10000 || n > 99999);
			
			int2vet(n, array);
			vet2mat(array, x, matriz);
		}
		
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				if (y == 4) {
					System.out.println(matriz[x][y]);					
				} else {
					System.out.print(matriz[x][y] + " - ");
				}
			}
		}
	}
	
	public void int2vet(Integer n, int[] array) {
		array[0] = n / 10000;
		array[1] = (n / 1000) % 10;
		array[2] = (n / 100) % 10;
		array[3] = (n / 10) % 10;
		array[4] = (n % 10);
	}
	
	public void vet2mat(int[] array, int posicao, int[][] matriz) {
		matriz[posicao] = array;
	}
}