package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

import br.com.logica.tecnicas.programacao.extras.Expondecial;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/16
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.numeroInvertido();
	}
	
	/**
	 * Faça um programa capaz de ler um número inteiro depois criar um novo número que deverá ser o número invertido. 
	 * 
	 * Exemplos:
	 * • 23 invertido é 32
	 * • 451 invertido é 154
	 * • 25874 invertido é 47852
	 */
	public void numeroInvertido() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero inteiro: "));

		int qd = 0;
		// Apenas encapsulando o calculo exponencial do número com br.com.logica.tecnicas.programacao.extras.Expondecial.java
		for (int x = 10, y = 1; x < n; x += Expondecial.elevado(10, y), y++) {
			int a = n / x;
			if (a < 10) {
				break;
			} else {
				qd++;
			}
		}
		qd++;
		
		int[] c = new int[qd];
		for (int x = 0; x < qd; x++) {
			int r = n % 10;
			n = n / 10;
			c[x] = r;
		}
		
		for (int x = 0, y = c.length - 1; x <= y; x++) {
			System.out.print(c[x]);
		}
	}
}