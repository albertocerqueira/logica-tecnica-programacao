package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/27
 */
public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.carregarMatriz();
	}
	
	/**
	 * Escreva um programa capaz de ler uma matriz de inteiros de tamanho 5x5. Depois seu programa deverá passar esta matriz para a função limpa(). 
	 * A função limpar() deverá eliminar todos os números negativos, trocando-os por zero. O programa principal deverá imprimir a matriz na volta da 
	 * função.
	 */
	public void carregarMatriz() {
		int COLUNAS = 5, LINHAS = 5;
		int[][] matriz = new int[COLUNAS][LINHAS];
		for (int x = 0, y = matriz.length; x < y ; x++) {
			for (int i = 0, c = matriz[x].length; i < c ; i++) {
				int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero da " + (x + 1) + "° coluna e " + (i + 1) + "° linha:"));
				matriz[x][i] = n;
			}
		}
		
		matriz = limpar(matriz);
		for (int x = 0, y = matriz.length; x < y ; x++) {
			for (int i = 0, c = matriz[x].length; i < c ; i++) {
				System.out.print(matriz[x][i] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] limpar(int[][] matriz) {
		for (int x = 0, y = matriz.length; x < y ; x++) {
			for (int i = 0, c = matriz[x].length; i < c ; i++) {
				int n = matriz[x][i];
				if (n < 0) {
					matriz[x][i] = 0;
				}
			}
		}
		return matriz;
	}
}