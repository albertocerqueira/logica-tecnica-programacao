package br.com.logica.tecnicas.programacao.exercicios00001;

import java.util.Random;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.produtoEscalar(50);
	}
	
	/**
	 * Suponha um vetor N com 10 elementos e outro vetor M com 10
	 * elementos. Faça um programa que calcule o produto escalar P de
	 * A por B. (Isto é, P = A[1]*B[1] + A[2]*B[2] + ... A[N]+B[N]).
	 */
	public void produtoEscalar(Integer numeroVetorAte) {
		Integer[] N = new Integer[10];
		Integer[] M = new Integer[10];
		Integer soma = 0;
		
		for (int x = 0; x<10; x++) {
			Random geradorN = new Random();
	        int numeroN = geradorN.nextInt(numeroVetorAte);
			N[x] = numeroN;
			
			Random geradorM = new Random();
	        int numeroM = geradorM.nextInt(numeroVetorAte);
			M[x] = numeroM;
			
			System.out.println((x+1) + "° n\u00famero do vetor N \u00e9 " + numeroN + " | " + (x+1) + "° n\u00famero do vetor M \u00e9 " + numeroM);
		}
		
		for (int x = 0; x < 10; x++) {
			soma += (N[x] + M[x]);
		}
		
		System.out.println("A soma de P = A[1]*B[1] + A[2]*B[2] + ... A[N]+B[N] resulta em " + soma + ".");
	}
}