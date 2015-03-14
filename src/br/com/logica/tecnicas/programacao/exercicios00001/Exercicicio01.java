package br.com.logica.tecnicas.programacao.exercicios00001;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.isQuadradoPerfeito(13.0);
		exe01.isQuadradoPerfeito(16.0);
	}
	
	/**
	 * Fazer um programa para ler um número inteiro e positivo N e responder se N e quadrado perfeito.
	 */
	public void isQuadradoPerfeito(Double numero) {
		Double raiz = Math.sqrt(numero);
		if (raiz * raiz == numero) {
			System.out.println("Este n\u00famero \u00e9 quadrado perfeito!\n");
		} else {
			System.out.println("Este n\u00famero n\u00e3o \u00e9 quadrado perfeito!\n");
		}
	}
}