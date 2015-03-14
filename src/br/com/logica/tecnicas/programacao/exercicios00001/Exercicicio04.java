package br.com.logica.tecnicas.programacao.exercicios00001;

import java.util.Random;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe01 = new Exercicicio04();
		Integer numerosAleatoriosPares = exe01.getNumerosAleatoriosPares();
		System.out.println("Cont\u00e9m " + numerosAleatoriosPares + " pares aleat\u00f3rios entre 1 e 1000.\n");
	}
	
	/**
	 * Escreva um programa que contenha uma funcao. A funcao deve ser 
	 * capaz de gerar 400 numeros entre 1 e 1000 e retornar a quantidade 
	 * de numeros pares que foram gerados.
	 */
	public Integer getNumerosAleatoriosPares() {
		int quantidadeNumerosPares=0;
		for (int x = 1; x <= 400; x++) {
			Random gerador = new Random();
	        int numero = gerador.nextInt(1000);
			
			if(numero % 2 == 0) {
				quantidadeNumerosPares++;
			}
		}
		return quantidadeNumerosPares;
	}
}