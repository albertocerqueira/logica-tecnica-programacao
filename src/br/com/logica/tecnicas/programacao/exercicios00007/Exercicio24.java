package br.com.logica.tecnicas.programacao.exercicios00007;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.calcularY();
	}
	
	/**
	 * Escreva um programa para calcular os valores de y, para as possibilidades a seguir:
	 * • Variando x de 0 a 10 com incrementos de 2, ou seja, você deve calcular e mostrar na tela o valor y para x = 0, para x = 2, para x = 4 etc.
	 * 
	 * Sendo: y = 2 * x
	 */
	public void calcularY() {
		System.out.println("Sendo: y = 2 * x");
		for (int x = 0; x <= 10; x += 2) {
			System.out.println("y = 2 * " + x + " = " + (2 * x));
		}
	}
}