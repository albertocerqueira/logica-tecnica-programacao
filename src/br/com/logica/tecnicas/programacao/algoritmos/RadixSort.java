package br.com.logica.tecnicas.programacao.algoritmos;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	
	private static final int MAX_CHARS = 28;

	public static void main(String[] args) {
		String vetor[] = { "20", "5", "6", "9", "25", "1", "2", "36", "100", "5", "9", "125", "7", "3", "4", "0", "23", "8", "10", "11" };
		RadixSort rs = new RadixSort();
		rs.radixSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}
	
    private void radixSort(String[] v) {
		Queue<String> queues[] = createQueues();
		for (int pos = maxSize(v) - 1; pos >= 0; pos--) {
			for (int i = 0; i < v.length; i++) {
				int q = queueNo(v[i], pos);
				queues[q].add(v[i]);
			}
			restore(queues, v);
		}
	}

	private void restore(Queue<String>[] qs, String[] v) {
		int contv = 0;
		for (int q = 0; q < qs.length; q++)
			while (qs[q].size() > 0)
				v[contv++] = qs[q].remove();
	}

	@SuppressWarnings("unchecked")
	private Queue<String>[] createQueues() {
		LinkedList<String>[] result = new LinkedList[MAX_CHARS];
		for (int i = 0; i < MAX_CHARS; i++) {
			result[i] = new LinkedList<String>();
		}
		return result;
	}

	private int queueNo(String string, int pos) {
		if (pos >= string.length()) {
			return 0;
		}
		char ch = string.charAt(pos);
		if ((ch >= 'A') && (ch <= 'Z')) {
			return (ch - 'A' + 1);
		}
		else if (ch >= 'a' && ch <= 'z') {
			return ch - 'a' + 1;
		}
		else {
			return 27;
		}
	}

	private int maxSize(String[] v) {
		int maxValue = v[0].length();

		for (int i = 1; i < v.length; i++) {
			if (maxValue < v[i].length()) {
				maxValue = v[i].length();
			}
		}
		return maxValue;
	}
}