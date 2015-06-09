package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe00 = new Exercicicio17();
		exe00.loop();
	}

	/**
	 * Escreva um laço que execute 20 vezesa. 
	 * a. Primeiramente como um while 
	 * b. Converta este laço para um do-while.
	 * c. Agora escreva como for.
	 */
	public void loop() {
		int c = 0;
		while (c != 20) {
			c++;
			System.out.println(c + " loop while");
		}
		
		c = 0;
		
		do {
			c++;
			System.out.println(c + " loop do-while");
		} while (c != 20);
		
		for (int x = 0; x < c; x++) {
			System.out.println((x + 1) + " loop for");
		}
	}
}