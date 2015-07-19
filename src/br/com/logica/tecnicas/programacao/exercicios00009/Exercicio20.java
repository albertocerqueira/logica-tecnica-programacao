package br.com.logica.tecnicas.programacao.exercicios00009;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.quantoZeSeraMaiorQueChico();
	}
	
	/**
	 * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. Construa um programa que 
	 * calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.	
	 */
	public void quantoZeSeraMaiorQueChico() {
		double c = 1.5, z = 1.1;
		int a = 0;
		while (true) {
			c += 0.02;
			z += 0.03;
			if (z > c) {
				break;
			}
			a++;
		}
		
		System.out.println("Em " + a + " anos Z\u00e9 ser\u00e1 maior que Chico.");
	}
}