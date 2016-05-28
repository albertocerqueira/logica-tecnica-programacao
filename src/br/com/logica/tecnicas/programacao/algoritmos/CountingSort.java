package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class CountingSort {

	public static void main(String[] args) {
		int vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		CountingSort cs = new CountingSort();
		cs.countingSort(vetor, 0, 126);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private void countingSort(int[] array, int min, int max) {
		int[] count = new int[max - min + 1];
		for (int number : array) {
			count[number - min]++;
		}
		int z = 0;
		for (int i = min; i <= max; i++) {
			while (count[i - min] > 0) {
				array[z] = i;
				z++;
				count[i - min]--;
			}
		}
	}
}