package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Exercicio03 exe03 = new Exercicio03();
		exe03.imprimirSequenciaImpar(5);
	}
	
	/**
	 * Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares. 
	 */
	public void imprimirSequenciaImpar(Integer numero) {
		int sequenciaImpar = 1;
		while (numero != 0) {
			if (sequenciaImpar % 2 != 0) {
				numero--;
				System.out.println(sequenciaImpar);
			}
			sequenciaImpar++;
		}
	}
}