package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2016/05/28
 */
public class CocktailSort {

	public static void main(String[] args) {
		Integer vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		CocktailSort cs = new CocktailSort();
		cs.cocktailSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private void cocktailSort(Integer[] A) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i <= A.length - 2; i++) {
				if (A[i] > A[i + 1]) {
					// test whether the two elements are in the wrong order
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				// we can exit the outer loop here if no swaps occurred.
				break;
			}
			swapped = false;
			for (int i = A.length - 2; i >= 0; i--) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					swapped = true;
				}
			}
			// if no elements have been swapped, then the list is sorted
		} while (swapped);
	}
}