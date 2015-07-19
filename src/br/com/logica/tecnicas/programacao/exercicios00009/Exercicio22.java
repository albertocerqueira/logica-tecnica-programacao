package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio22 {

	public static void main(String[] args) {
		Exercicio22 exe22 = new Exercicio22();
		exe22.informacoesDeNumerosDigitados();
	}
	
	/**
	 * Faça um programa que leia uma quantidade não determinada de números positivos. Calcule a quantidade de números pares e ímpares, a média de 
	 * valores pares e a média geral dos números lidos. O número que encerrará a leitura será zero.
	 */
	public void informacoesDeNumerosDigitados() {
		int q = 0, p = 0, i = 0, s = 0, sp = 0;
		while (true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero inteiro qualquer: "));
			if (n == 0) {
				break;
			}
			
			if (n % 2 == 0) {
				p++;
				sp += n;
			}
			
			if (n % 2 == 1) {
				i++;
			}
			
			s += n;
			q++;
		}
		
		System.out.println(i + " n\u00fameros \u00edmpares");
		System.out.println(p + " n\u00fameros pares");
		System.out.println((sp / p) + " m\u00e9dia dos n\u00fameros pares");
		System.out.println((s / q) + " m\u00e9dia dos n\u00fameros");
	}
}