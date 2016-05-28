package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class QuickSort {
	
    public static void main(String[] args) {
        int[] vetor = {5, 7, 1, 8, 3, 9, 12, 2, 3, 78, 3, 56, 0, 1};
        QuickSort qs = new QuickSort();
        qs.ordenarVetor(vetor);
        System.out.println("Vetor...");
        for (int x = 0, l = vetor.length; x < l; x++) {
            System.out.print(vetor[x] + " ");
        }
    }
    
    private void ordenarVetor(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }
    
    private void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indexPivo = dividir(vetor , inicio , fim);
            quickSort(vetor, inicio, indexPivo - 1);
            quickSort(vetor, indexPivo + 1, fim);
        }
    }
    
    private int dividir(int[] vetor , int inicio , int fim) {
        int pivo , ponteiroEsquerda , ponteiroDireita = fim;
        ponteiroEsquerda = inicio + 1;
        pivo = vetor[inicio];
        while (ponteiroEsquerda <= ponteiroDireita) {
            while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroEsquerda] <= pivo) {
                ponteiroEsquerda++;
            }
            while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroDireita] > pivo) {
                ponteiroDireita--;
            }
            if (ponteiroEsquerda < ponteiroDireita) {
                trocar(vetor, ponteiroDireita, ponteiroEsquerda);
                ponteiroEsquerda++;
                ponteiroDireita--;
            }
        }
        trocar(vetor, inicio, ponteiroDireita);
        return (ponteiroDireita);
    }
    
    private void trocar(int[] vetor , int i , int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}