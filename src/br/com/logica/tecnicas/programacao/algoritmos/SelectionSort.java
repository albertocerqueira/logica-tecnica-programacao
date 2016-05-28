package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class SelectionSort {

	public static void main(String[] args) {
		int vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private void selectionSort(int[] vetor) {
		int length = vetor.length;
		for (int fixo = 0; fixo < length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < length; i++) {
				if (vetor[i] < vetor[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				// Troca
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
			}
			
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