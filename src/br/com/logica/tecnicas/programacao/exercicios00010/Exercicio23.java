package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/23
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.alterandoPosicoes();
	}
	
	/**
	 * Escreva um programa que leia um número inteiro de quatro algarismos (vamos supor que o usuário digite um número de quatro algarismos, ou seja, 
	 * um número entre 1000 e 9999). Você deve trocar o primeiro algarismo com o último, construindo um novo número, e imprimir na tela este novo 
	 * número.
	 * 
	 * Exemplo:
	 * Se digitado o número 5341, deve aparecer na tela o número 1345.
	 * Se digitado o número 4578, deve aparecer na tela o número 8574.
	 * Se digitado o número 1230, deve aparecer na tela o número 231.
	 */
	public void alterandoPosicoes() {
		int n = 0;
		while (n < 1000 || n > 9999) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero de quatro algoritmos: "));
			int n1 = n / 1000;
			int n2 = n % 1000;
			int n3 = n % 10;
			int n4 = n2 - n3;
			System.out.println(n3 + "" + (n4 + n1));
		}
	}
}