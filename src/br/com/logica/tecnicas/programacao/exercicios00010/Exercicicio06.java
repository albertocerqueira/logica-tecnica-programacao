package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.verificarRaiz();
	}

	/**
	 * Uma maneira de encontrar a raiz aproximada de um número inteiro é fazer a subtração continua de números impares começando pelo 1 e contar 
	 * quantas subtrações foram feitas, antes do número se tornar negativo. Por exemplo:
	 * n = 66
	 * 1° subtração 66 - 1  = 65
	 * 2° subtração 65 - 3  = 62
	 * 3° subtração 62 - 5  = 57
	 * 4° subtração 57 - 7  = 50
	 * 5° subtração 50 - 9  = 41
	 * 6° subtração 41 - 11 = 30
	 * 7° subtração 30 - 13 = 17
	 * 8° subtração 17 - 15 = 2
	 * 9° subtração 2  - 17 = - 15 (inválida, pois, é negativa)
	 * 
	 * Escreva um programa que leia um número inteiro n e chame uma função raizAproximada() passando n e que seja capaz de calcular e retornar a
	 * raiz quadrada inteira deste número. Seu programa deverá imprimir o resultado de forma clara. Faça o teste de mesa para n=36 e n=54.
	 */
	public void verificarRaiz() {
		int r1 = raizAproximada(36);
		System.out.println("A raiz de 36 \u00e9 " + r1 + ".");
		int r2 = raizAproximada(54);
		System.out.println("A raiz de 54 \u00e9 " + r2 + ".");
	}
	
	public int raizAproximada(int n) {
		int x = 0, c = 0;
		while (n >= 0) {
			x++;
			if (x%2==1) {
				n = n - x;
				c++;
			}
		}
		return c - 1;
	}
}