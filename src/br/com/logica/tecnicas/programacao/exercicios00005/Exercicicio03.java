package br.com.logica.tecnicas.programacao.exercicios00005;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		exe03.verificarCidades();
	}
	
	/**
	 *  A cidade A possui 90.000 habitantes e a cidade B 50.000. A população da cidade A cresce
	 *  0,9 % ao ano enquanto que a da cidade B cresce 1,5% ao ano. Faça um programa que calcule 
	 *  quantos anos são necessários para que a cidade B tenha mais habitantes que a cidade A. 
	 */
	public void verificarCidades() {
		Double cidade1 = 90000.0, cidade2 = 50000.0;
		int anos = 0;
		do {
			cidade1 = cidade1 * 1.009;
			cidade2 = cidade2 * 1.015;
			anos++;
		}
		while (cidade1 > cidade2);
		System.out.println("Ap\u00f3s " + anos + " anos a popula\u00e7\u00e3o da cidade B sera maior que a da cidade A.");
	}
}