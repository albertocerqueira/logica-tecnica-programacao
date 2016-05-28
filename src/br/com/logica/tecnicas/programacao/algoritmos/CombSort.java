package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2016/05/28
 */
public class CombSort {

	public static void main(String[] args) {
		Integer vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		CombSort cs = new CombSort();
		cs.combSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	public <E extends Comparable<? super E>> void combSort(E[] input) {
		int gap = input.length;
		boolean swapped = true;
		while (gap > 1 || swapped) {
			if (gap > 1) {
				gap = (int) (gap / 1.247330950103979);
			}

			int i = 0;
			swapped = false;
			while (i + gap < input.length) {
				if (input[i].compareTo(input[i + gap]) > 0) {
					E t = input[i];
					input[i] = input[i + gap];
					input[i + gap] = t;
					swapped = true;
				}
				i++;
			}
		}
	}
}