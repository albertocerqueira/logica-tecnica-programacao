package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/27
 */
public class Exercicio09 {
	
	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.carregarMatriz(10);
	}
	
	/**
	 * Com a experiência do exercício br.com.logica.tecnicas.programacao.exercicios00000.Exercicio00, agora faça um programa que leia 
	 * obrigatoriamente um número par que representa a quantidade de linha/coluna da matriz e que gere e imprima a matriz.
	 */
	public void carregarMatriz(int par) {
		int parMenos1 = par - 1;
		int meia = par / 2;
		
		for (int x = 0 ; x < par ; x++) {
			for (int y = 0 ; y < par ; y++) {
				if (x == y || (y + x) == parMenos1) {
					if (x < meia) {
						System.out.print((x + 1) + " ");
					} else {
						System.out.print((par - x) + " ");
					}
				} else if (x <= y && (x + y) <= parMenos1) {
					System.out.print((x + 1) + " ");
				} else if (x >= y && (x + y) <= parMenos1) {
					System.out.print((y + 1) + " ");
				} else if (x <= y && (x + y) >= parMenos1) {
					if (y < meia) {
						System.out.print((y + 1) + " ");
					} else {
						System.out.print((par - y) + " ");
					}
				} else {
					if (x < meia) {
						System.out.print((x + 1) + " ");
					} else {
						System.out.print((par - x) + " ");
					}
				}
			}
			
			System.out.println();
		}
	}
}