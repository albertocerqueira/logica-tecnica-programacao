package br.com.logica.tecnicas.programacao.algoritmos;

import java.io.IOException;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class InsertionSort {

	public static void main(String[] args) throws IOException {
		int vetor [] = {20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11};
		InsertionSort is = new InsertionSort();
		is.insertionSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
            System.out.print(vetor[x] + " ");
        }
	}

	public void insertionSort(int[] vetor) {
		int j, key, i, length = vetor.length;
		for (j = 1; j < length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
				
				/*
                 * Com este loop e possivel analizar o trabalho do vetor trocando os valores,
                 * empurrando o maior para a ponta ate ordenar o vetor por completo.
                 */
                for (int k = 0; k < length; k++) {
                    System.out.print(vetor[k] + " ");
                }
                System.out.println(" ");
			}
			vetor[i + 1] = key;
		}
	}
}