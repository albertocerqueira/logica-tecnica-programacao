package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class SellSort {

	public static void main(String[] args) {
		int vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		SellSort bs = new SellSort();
		bs.shellSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private void shellSort(int[] vetor) {
		int h = 1;
		int length = vetor.length;
		while (h < length) {
			h = h * 3 + 1;
		}
		h = h / 3;
		int c, j;
		while (h > 0) {
			for (int i = h; i < length; i++) {
				c = vetor[i];
				j = i;
				while (j >= h && vetor[j - h] > c) {
					vetor[j] = vetor[j - h];
					j = j - h;
				}
				vetor[j] = c;
			}
			h = h / 2;
			
			/*
             * Com este loop e possivel analizar o trabalho do vetor trocando os valores,
             * empurrando o maior para a ponta ate ordenar o vetor por completo.
             */
            for (int k = 0; k < length; k++) {
                System.out.print(vetor[k] + " ");
            }
            System.out.println(" ");
		}
	}
}