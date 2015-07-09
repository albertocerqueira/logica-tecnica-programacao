package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicicio24 {

	public static void main(String[] args) {
		Exercicicio24 exe24 = new Exercicicio24();
		exe24.somandoNumerosDeTresDigitos();
	}
	
	/**
	 * Escreva um programa que leia um número inteiro n. Seu programa deve ler n números inteiros e positivos com 3 dígitos cada um. 
	 * Imprima a soma dos dígitos de cada um dos números ímpares lidos; 
	 * Imprima também a quantidade denúmeros divisíveis por 2. 
	 */
	public void somandoNumerosDeTresDigitos() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00fameros para ser lida: "));
		int s = 0, d = 0;;
		for (int x = 0; x < n; x++) {
			while (true) {
				int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero de tr\u00eas digitos: "));
				if (n3 >= 100 && n3 <= 999) {
					s += n3;
					if (n3 % 2 == 0) {
						d++;
					}
					break;
				}
			}
		}
		
		System.out.println("A soma total e " + s + ".");
		System.out.println(d + " n\u00fameros divis\u00edveis por 2.");
	}
}