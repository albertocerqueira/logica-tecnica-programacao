package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class GnomeSort {

	public static void main(String[] args) {
		int vetor[] = { 20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11 };
		GnomeSort gs = new GnomeSort();
		gs.gnomeSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
			System.out.print(vetor[x] + " ");
		}
	}

	private void gnomeSort(int[] vetor) {
		int pivout = 0;
		int aux, length = vetor.length;
		while (pivout < (vetor.length - 1)) {
			if (vetor[pivout] > vetor[pivout + 1]) {
				aux = vetor[pivout];
				vetor[pivout] = vetor[pivout + 1];
				vetor[pivout + 1] = aux;
				if (pivout > 0) {
					pivout -= 2;
				}
			}
			pivout++;
			
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