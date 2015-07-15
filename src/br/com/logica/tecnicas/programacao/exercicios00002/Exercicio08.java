package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.somaMultiplo();
	}
	
	/**
	 * Fazer um programa para calcular a soma dos N primeiros multiplos de um inteiro K, onde N e K são lidos e são números inteiros e positivos.
	 */
	public void somaMultiplo() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		int contadorMutiplos = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero menor que o anterior:"));
		int soma = 0, contador = contadorMutiplos;

		for (int x = 1; x < numero; x++) {
			if (numero % x == 0) {
				soma += x;
				contador--;
			}
			
			if (contador == 0) {
				break;
			}
		}
		System.out.println("A soma dos primeiros " + contador + " m\u00faltiplos de " + numero + " \u00e9 " + soma + ".");
	}
}