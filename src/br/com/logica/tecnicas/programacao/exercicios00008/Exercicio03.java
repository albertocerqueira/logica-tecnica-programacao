package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Exercicio03 exe03 = new Exercicio03();
		exe03.calcularMedia(new int[]{1, 2, 3, 4, 5});
	}
	
	/**
	 * Dados 5 valores numéricos, escrever um programa que calcule e exiba a média dos valores dados e quantos desses valores estão acima da média.
	 * Resolução sem utilizar vetor:
	 */
	public void calcularMedia(int[] num) {
		int cont;
		float media;
		cont = 0;
		media = 0;
		for (int i = 0; i <= 4; i++) {
			media = media + num[i];
		}
		media = (float) (media/5.0);
		System.out.println("M\u00e9dia: " + media);
		for (int i = 0; i <= 4; i++) {
			if (num[i] > media) {				
				cont = cont +1;
			}
		}
		System.out.println("O n\u00famero de valores acima da m\u00e9dia \u00e9 " + cont);
	}
}