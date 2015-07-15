package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.calcularMedia(1, 2, 3, 4, 5);
	}
	
	/**
	 * Dados 5 valores numéricos, escrever um programa que calcule e exiba a média dos valores dados e quantos desses valores estão acima da média.
	 * Resolução sem utilizar vetor:
	 */
	public void calcularMedia(int n1, int n2, int n3, int n4, int n5) {
		int cont;
		float media;
		cont= 0;
		media = ( (float) (n1 + n2 + n3 + n4 + n5) ) / 5;
		System.out.println("M\u00e9dia: " + media);
		if (n1 > media) {
			cont = cont + 1;			
		}
		if (n2 > media) {			
			cont = cont + 1;
		}
		if (n3 > media) {			
			cont = cont + 1;
		}
		if (n4 > media) {			
			cont = cont + 1;
		}
		if (n5 > media) {			
			cont = cont + 1;
		}
		System.out.println("O n\u00famero de valores acima da m\u00e9dia \u00e9 " + cont);
	}
}