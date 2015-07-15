package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/24
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.converterMinutos();
	}

	/**
	 * Uma hora tem 60 minutos. Em 20 horas quantos minutos existem? Escreva um programa que calcule e imprima na tela este valor.
	 */
	public void converterMinutos() {
		System.out.println("Em 20 horas temos " + (20 * 60) + " minutos.");
	}
}