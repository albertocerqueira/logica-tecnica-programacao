package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.calculoValorCobradoPorAgencias();
	}
	
	/**
	 * Precisamos alugar um carro por um único dia. Consultadas duas agências, a primeira cobra R$62,00 pela diária e R$1,40 por quilômetro rodado. 
	 * A segunda cobra diária de R$80,00 e mais R$1,20 por quilômetro rodado. Sabendo que rodaremos 190 Km, escreva um programa que calcule quanto 
	 * pagaríamos em cada uma das agências.
	 */
	public void calculoValorCobradoPorAgencias() {
		System.out.println("Primeira agencia vai cobrar R$" + ((1.4 * 190) + 62));
		System.out.println("Segunda agencia vai cobrar R$" + ((1.2 * 190) + 80));
	}
}