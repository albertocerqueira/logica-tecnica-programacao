package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.imprimirParesDivisiveisPorTres();
	}
	
	/**
	 * Escreva um programa que calcule a média dos elementos no intervalo entre 38 e 1000 que são simultaneamente pares e divisíveis por 3.
	 */
	public void imprimirParesDivisiveisPorTres() {
		int s = 0, q = 0;
		for (int x = 38; x < 1000; x++) {
			if (x % 2 == 0 && x % 3 == 0) {
				s += x;
				q++;
			}
		}
		
		System.out.println("A m\u00e9dia dos n\u00fameros pares e divis\u00edveis por 3 entre 38 e 1000 \u00e9 " + (s / q));
	}
}