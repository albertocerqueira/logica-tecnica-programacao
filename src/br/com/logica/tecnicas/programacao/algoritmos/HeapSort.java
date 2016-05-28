package br.com.logica.tecnicas.programacao.algoritmos;

public class HeapSort {
	
	public static void main(String[] args) {
		Integer vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		HeapSort hs = new HeapSort();
		hs.heapSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private <T extends Comparable<? super T>> void heapSort(T[] v) {
		buildMaxHeap(v);
		int n = v.length;

		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);
		}
	}

	private <T extends Comparable<? super T>> void buildMaxHeap(T v[]) {
		for (int i = v.length / 2 - 1; i >= 0; i--) {
			maxHeapify(v, i, v.length);
		}
	}

	private <T extends Comparable<? super T>> void maxHeapify(T[] v, int pos, int n) {
		int max = 2 * pos + 1, right = max + 1;
		if (max < n) {
			if (right < n && v[max].compareTo(v[right]) < 0)
				max = right;
			if (v[max].compareTo(v[pos]) > 0) {
				swap(v, max, pos);
				maxHeapify(v, max, n);
			}
		}
	}

	private void swap(Object[] v, int j, int aposJ) {
		Object aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}
}