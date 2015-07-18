package br.com.logica.tecnicas.programacao.exercicios00009;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/18
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Exercicio14 exe14 = new Exercicio14();
		exe14.calcularZ();
	}
	
	/**
	 * Escreva um programa para calcular o valor z, para as possibilidades a seguir:
	 * 
	 * • variando x de 0.5 a 4.5 com incrementos de 0.5;
	 * • variando x de 1 a 5 com incrementos de 1;
	 * • variando x de 11 a 5 com decrementos de 2.
	 * 
	 * Sendo: z = 3x² + 1x + 10
	 * 
	 * Obs: é igual a, decrementar significa diminuir e incrementar significa somar.
	 */
	public void calcularZ() {
		double x = 0;
		
		while (x < 5) {
			x += 0.5;
			double z = (3 * x * x) + (1 * x) + 10;
			System.out.println("Para x " + x + " temos " + z +".");
		}
		
		x = 0;
		
		while (x < 6) {
			x++;
			double z = (3 * x * x) + (1 * x) + 10;
			System.out.println("Para x " + x + " temos " + z +".");
		}
		
		while (x >= 6 && x <= 11) {
			x += 2;
			double z = (3 * x * x) + (1 * x) + 10;
			System.out.println("Para x " + x + " temos " + z +".");
		}
	}
}