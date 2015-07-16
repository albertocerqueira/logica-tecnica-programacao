package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/15
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calcularNumerosComTresDigitos();
	}
	
	/**
	 * Escreva um programa que leia um número inteiro n. Seu programa deve ler n números inteiros e positivos com 3 dígitos cada um.
	 * 
	 * • Imprima a soma dos dígitos de cada um dos números ímpares lidos;
	 * • Imprima também a quantidade de números divisíveis por 2.
	 */
	public void calcularNumerosComTresDigitos() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero inteiro qualquer: "));
		int q2 = 0;
		for (int x = 0; x < n; x++) {
			int ns = 0;
			while (true) {
				ns = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero: "));
				if (ns >= 100 && ns <= 999) {
					break;
				}
			}
			
			if (ns % 2 == 0) {
				q2++;
			} else {
				int n0 = ns % 100;
				int n1 = ns % 10;
				int n2 = n0 / 10;
				int n3 = ns / 100;
				
				System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + (n1 + n2 + n3));
			}
		}
		
		System.out.println("Quantidade de n\u00fameros pares " + q2);
	}
}