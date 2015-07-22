package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/21
 */
public class Exercicio11 {

	public static void main(String[] args) {
		Exercicio11 exe11 = new Exercicio11();
		exe11.calcularTamanhoDaFazenda();
	}
	
	/**
	 * Existem medidas específicas para grandes extensões, como sítios, chácaras e fazendas. São elas o hectare e o are. 
	 * 
	 * Onde:
	 * 		1 hectare(ha) = 10000m2
	 * 		1 are(a) = 100m2
	 * Uma fazenda possui 132 500m2 de área. Escreva um programa que calcule qual a sua medida em hectare e em are.
	 * 
	 * OBS: Medidas são números reais.
	 */
	public void calcularTamanhoDaFazenda() {
		int m = 1;
		int a = m * 100;
		int h = m * 10000;
		
		int mf = 132500;
		
		double af = mf / a;
		System.out.println("A fazenda em are possui " + af + "m²");
		double hf = (mf / h);
		System.out.println("A fazenda em hectare possui " + hf + "m²");
	}
}