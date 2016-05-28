package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class BubbleSort {
	
    public static void main(String[] args) {
        int vetor [] = {20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(vetor);
        for (int x = 0, y = vetor.length; x < y; x++) {
            System.out.print(vetor[x] + " ");
        }
    }
    
    private void bubbleSort(int[] vetor) {
        int auxiliar, length = vetor.length;
        for (int x = 0; x < length - 1; x++) {
            for (int y = 0 ; y < length - 1 - x; y++) {
                if(vetor[y] > vetor[y+1]){
                    auxiliar = vetor[y];
                    vetor[y] = vetor[y+1];
                    vetor[y+1] = auxiliar;
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
            System.out.println(" ");
        }
    }
}