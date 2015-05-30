package br.com.logica.tecnicas.programacao.algoritmos;

import java.util.Scanner;

public class BuscaBinaria {

	static int[] vetor = {1, 3, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 23, 24, 25, 27, 29, 30, 41};
    static boolean naoAchei = false;
    long tempo = System.currentTimeMillis();
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner procura = new Scanner(System.in);
        int numero;
        System.out.print("Digite um n\u00famero qualquer: ");
        numero = procura.nextInt();
        binaria(numero);
    }
    
    public static void binaria(int numero){
        long tempo = System.currentTimeMillis();
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;
        while (inicio <= fim) {
            meio = (inicio + fim)/2;
            if (vetor[meio] == numero) {
            	System.out.println("N\u00famero encontrado na possi\u00e7\u00e3o " + (meio + 1) + ".");
                naoAchei = true;
                break;
            }
            if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (!naoAchei) {
        	System.out.println("Este n\u00famero n\u00e3o foi encontrado!!!");
        }
        System.out.println("Demorou " + (System.currentTimeMillis() - tempo) + " milisegundos realizar a tarefa.");
    }
}