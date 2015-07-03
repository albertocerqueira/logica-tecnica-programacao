package br.com.logica.tecnicas.programacao.algoritmos;

import java.util.Random;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class BogoSort {

	public static void main(String[] args) {
        int vetor [] = {20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11};
        bogoSort(vetor);
        for (int x = 0, y = vetor.length; x < y; x++) {
            System.out.print(vetor[x] + " ");
        }
    }
	
	public static void bogoSort(int[] array) {
		while (!isSorted(array)) {
			/*
             * Com este loop e possivel analizar o trabalho do vetor trocando os valores,
             * empurrando o maior para a ponta ate ordenar o vetor por completo.
             */
			for (int x = 0, y = array.length; x < y; x++) {
	            System.out.print(array[x] + " ");
	        }
			System.out.println();
			
			array = randomArray(array);
		}
	}

	private static boolean isSorted(int[] array) {
		for (int i = 0; i < (array.length - 1); ++i) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
	}

	private static int[] randomArray(int[] array) {
		int size = array.length;
		int[] indices = new int[size];
		for (int i = 0; i < size; i++) {
			indices[i] = i;
		}

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			boolean unique = false;
			int nRandom = 0;
			while (!unique) {
				unique = true;
				nRandom = random.nextInt(size);
				for (int j = 0; j < i; j++) {
					if (indices[j] == nRandom) {
						unique = false;
						break;
					}
				}
			}

			indices[i] = nRandom;
		}

		int[] result = new int[size];
		for (int k = 0; k < size; k++) {
			result[indices[k]] = array[k];
		}

		return result;
	}
}