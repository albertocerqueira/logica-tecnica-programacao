package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio10 {

	public static void main(String[] args) {
		Exercicicio10 exe10 = new Exercicicio10();
		exe10.matriz();
	}

	/**
	 * Escreva um laço for que inicialize uma matriz 10x15 com valores de 0 a 149.
	 */
	public void matriz() {
		int[][] m = new int[10][15];
		int c = 0;
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 15; y++) {
				m[x][y] = c;
				c++;
			}
		}
		
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 15; y++) {
				System.out.print(m[x][y] + " ");
			}
			System.out.println();
		}
	}
}