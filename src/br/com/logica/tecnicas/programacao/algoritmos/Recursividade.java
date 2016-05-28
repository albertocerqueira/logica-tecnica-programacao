package br.com.logica.tecnicas.programacao.algoritmos;

import java.util.Scanner;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/27
 */
public class Recursividade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        int numero;
        Scanner recebe = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        numero = recebe.nextInt();
        imprimir(numero);
        System.out.println ("");
        imprimirDecrecente(numero);
    }

    public static void imprimir(int numero){
        if (numero>=0) {
            imprimir(numero-1);
        }
        System.out.print(numero + ", ");
    }

    public static void imprimirDecrecente(int numero){
        System.out.print(numero + ", ");
        if (numero>=0) {
            imprimir(--numero);
        }
    }
}