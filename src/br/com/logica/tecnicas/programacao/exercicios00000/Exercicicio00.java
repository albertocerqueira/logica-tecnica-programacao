package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/26
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.criarMatriz();
	}

	/**
	 * Faça um programa capaz de gerar e mostrar a matriz abaixo:
	 * 1 1 1 1 1 1 
	 * 1 2 2 2 2 1 
	 * 1 2 3 3 2 1 
	 * 1 2 3 3 2 1 
	 * 1 2 2 2 2 1 
	 * 1 1 1 1 1 1
	 */
	public void criarMatriz() {
		int COLUNAS = 6 , LINHAS = 6 , MEIACOLUNA = 3;/*com meiacoluna as linha do meio podem ser trocada para mostra uma matriz maior ou menor*/
		int[][] matriz = new int[COLUNAS][LINHAS];
		for (int x = 0 ; x < LINHAS ; x++) {
			for (int y = 0 ; y < COLUNAS ; y++) {
				if (x==0 || x==5) {
					matriz[x][y] = 1;
					System.out.print(matriz[x][y] + " ");
				}
			}
			for (int y = 0 ; y < COLUNAS ; y++) {
				if (x==1 || x==4) {
					if (y==0 || y==COLUNAS-1) {
						matriz[x][y] = 1;
						System.out.print(matriz[x][y] + " ");
					} else {
						matriz[x][y] = 2;
						System.out.print(matriz[x][y] + " ");
					}
				}
			}
			if (x==2 || x==3) {
				for (int y = 0 ; y < MEIACOLUNA ; y++) {
					matriz[x][y] = y + 1;
					System.out.print(matriz[x][y] + " ");
				}
				for (int y = MEIACOLUNA - 1 ; y >= 0 ; y--) {
					System.out.print(matriz[x][y] + " ");
				}
			}
			System.out.println();
		}
	}
}