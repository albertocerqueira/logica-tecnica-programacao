package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.verificarNumeroDeDoisDigitos();
	}
	
	/**
	 * Escreva um programa que leia um número de dois algarismos. Se o usuário tiver digitado corretamente (um número entre 10 e 99), o programa deve
	 * verificar se o primeiro algarismo que forma o número é divisor do segundo número, e, se for divisor, imprimir na tela a mensagem “regra 
	 * confirmada”. Ao final o programa deve imprimir o número digitado pelo usuário.  
	 * 
	 * Exemplos:  
	 * • Se digitado o número 24 deve aparecer na tela a mensagem “regra confirmada” e depois o número 24. 
	 * • Se digitado o número 25 deve aparecer na tela apenas o número 25.  
	 */
	public void verificarNumeroDeDoisDigitos() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero de dois digitos: "));
		
		if (n >= 10 && n <= 99) {
			int n1 = n % 10;
			int n2 = n / 10;
			if (n1 % n2 == 0) {
				System.out.println("Regra confirmada.");
			} else {
				System.out.println("Regra n\u00e3o confirmada.");
			}
		} else {
			System.out.println("Regra n\u00e3o confirmada.");
		}
	}
}