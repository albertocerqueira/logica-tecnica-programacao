package br.com.logica.tecnicas.programacao.exercicios00007;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.calcularY();
	}
	
	/**
	 * Escreva um programa para calcular o valor y, para as possibilidades a seguir:
	 * • Variando x de 15 a 5 com decrementos de 3, ou seja, você deve calcular e mostrar na tela o valor y para x = 15, para x = 12, para x = 9 etc.
	 * 
	 * Sendo: y = 3*x – 3
	 */
	public void calcularY() {
		System.out.println("Sendo: y = 3 * x - 3");
		for (int x = 15; x >= 5; x -= 3) {
			System.out.println("y = 3 * " + x + " - 3 = " + (3 * x - 3));
		}
	}
}