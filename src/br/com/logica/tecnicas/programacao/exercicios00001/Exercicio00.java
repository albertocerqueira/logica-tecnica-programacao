
package br.com.logica.tecnicas.programacao.exercicios00001;

import br.com.logica.tecnicas.programacao.extras.RaizQuadrada;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio00 {

	public static void main(String[] args) {
		Exercicio00 exe00 = new Exercicio00();
		exe00.isQuadradoPerfeito(13);
		exe00.isQuadradoPerfeito(16);
	}
	
	/**
	 * Fazer um programa para ler um número inteiro e positivo N e responder se N é quadrado perfeito.
	 */
	public void isQuadradoPerfeito(int numero) {
		int raiz = RaizQuadrada.get(numero);
		if (raiz * raiz == numero) {
			System.out.println("Este n\u00famero \u00e9 quadrado perfeito!");
		} else {
			System.out.println("Este n\u00famero n\u00e3o \u00e9 quadrado perfeito!");
		}
	}
}