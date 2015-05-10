package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.loop();
	}

	/**
	 * Escreva um laço (while, for, do-while) que resulte em um laço infinito.
	 */
	public void loop() {
		//whileInfinito();
		//doWhileInfinito();
		//forInfinito();
	}
	
	public void whileInfinito() {
		while (true) {
			System.out.println("loop while");
		}
	}

	public void doWhileInfinito() {
		do {
			System.out.println("loop do-while");
		} while (true);
	}
	
	public void forInfinito() {
		for (int x = 0; x < 1; x++) {
			x--;
			System.out.println("loop for");
		}
	}
}