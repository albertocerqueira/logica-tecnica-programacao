package br.com.logica.tecnicas.programacao.exercicios00009;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/08
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.inverterVetores();
	}
	
	/**
	 * Faça um programa que leia dois vetores unidimensionais A e B, de dimensão 8 e realize a troca dos elementos destes vetores; ou seja, após a
	 * execução do programa o vetor B deverá conter os valores fornecidos para o vetor A, e vice-versa. Depois o programa deve imprimir o conteúdo
	 * dos dois vetores.
	 */
	public void inverterVetores() {
		int QUANTIDADE = 8;
		int[] a = RandomUtils.gerarNumerosAleatorios(QUANTIDADE, 0, 100);
		int[] b = RandomUtils.gerarNumerosAleatorios(QUANTIDADE, 0, 100);
		
		System.out.println("Vetor A:");
		for (int x = 0; x < QUANTIDADE; x++) {
			if (x == (QUANTIDADE - 1)) {				
				System.out.print(a[x]);
			} else {
				System.out.print(a[x] + ", ");
			}
		}
		System.out.println("\nVetor B:");
		for (int x = 0; x < QUANTIDADE; x++) {
			if (x == (QUANTIDADE - 1)) {				
				System.out.print(b[x]);
			} else {
				System.out.print(b[x] + ", ");
			}
		}
		
		int[] c = new int[QUANTIDADE];
		for (int x = 0; x < QUANTIDADE; x++) {
			c[x] = a[x];
			a[x] = b[x];
			b[x] = c[x];
		}
		
		System.out.println("\nVetor A invertido:");
		for (int x = 0; x < QUANTIDADE; x++) {
			if (x == (QUANTIDADE - 1)) {				
				System.out.print(a[x]);
			} else {
				System.out.print(a[x] + ", ");
			}
		}
		System.out.println("\nVetor B invertido:");
		for (int x = 0; x < QUANTIDADE; x++) {
			if (x == (QUANTIDADE - 1)) {				
				System.out.print(b[x]);
			} else {
				System.out.print(b[x] + ", ");
			}
		}
	}
}