package br.com.logica.tecnicas.programacao.algoritmos;

import java.util.Scanner;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class BuscaSequencial {

	static int[] vetor = {1, 3, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 23, 24, 25, 27, 29, 30, 41};
    static boolean naoAchei = false;
    long tempo = System.currentTimeMillis();
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner procura = new Scanner(System.in);
        int numero;
        System.out.print("Digite um n\u00famero qualquer: ");
        numero = procura.nextInt();
        sequencial(numero);
    }
    
    private static void sequencial(int numero) {
        long tempo = System.currentTimeMillis();
        for (int i = 0; i < vetor.length;i++) {
            if (vetor[i] == numero) {
                System.out.println("N\u00famero encontrado na possi\u00e7\u00e3o " + (i + 1) + ".");
                naoAchei = true;
                break;
            }
        }
        if (!naoAchei) {
            System.out.println("Este n\u00famero n\u00e3o foi encontrado!!!");
        }
        System.out.println("Demorou " + (System.currentTimeMillis() - tempo) + " milisegundos realizar a tarefa.");
    }
}