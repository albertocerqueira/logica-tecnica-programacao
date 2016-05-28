package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/02
 */
public class BucketSort {

	public static void main(String[] args) {
        int vetor [] = {20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11};
        BucketSort bs = new BucketSort();
        bs.bucketSort(vetor, 125);
        for (int x = 0, y = vetor.length; x < y; x++) {
            System.out.print(vetor[x] + " ");
        }
    }
	
	private void bucketSort(int[] a, int maxVal) {
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}
}