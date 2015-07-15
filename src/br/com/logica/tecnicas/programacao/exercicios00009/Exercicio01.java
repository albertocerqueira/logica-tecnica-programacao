package br.com.logica.tecnicas.programacao.exercicios00009;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/06
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Exercicio01 exe01 = new Exercicio01();
		exe01.imprimirMaiorEmenorNumeroAleatorio();
	}
	
	/**
	 * Escreva um programa que armazene em um vetor números entre 10 e 50. Depois o programa deve encontrar o maior valor e sua posição, bem como o 
	 * menor valor e também sua posição. Imprimir na tela os valores encontrados.
	 */
	public void imprimirMaiorEmenorNumeroAleatorio() {
		int[] ns = RandomUtils.gerarNumerosAleatorios(50, 10, 50);// Apenas encapsulando a criação de números aleatórios.
		int maior = 0, posMaior = 0, menor = ns[0], posMenor = 0;
		for (int x = 0, y = ns.length; x < y; x++) {
			// System.out.println(ns[x]);
			int n = ns[x];
			if (maior < n) {
				maior = n;
				posMaior = x + 1;
			}
			if (menor > n) {
				menor = n;
				posMenor = x + 1;
			}
		}
		System.out.println("O maior n\u00famero \u00e9 " + maior + " e est\u00e1 na posi\u00e7\u00e3o " + posMaior + "°.");
		System.out.println("O menor n\u00famero \u00e9 " + menor + " e est\u00e1 na posi\u00e7\u00e3o " + posMenor + "°.");
	}
}