package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/01
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe14 = new Exercicicio14();
		exe14.imprimirNumeros();
	}
	
	/**
	 * Escrever um programa que lê um conjunto de 4 valores "i, a, b, c", onde i é um valor inteiro e positivo, e "a, b, c" são quaisquer valores
	 * reais, e os escreve como segue:
	 * Se i = 1, escrever os três valores a, b, c em ordem crescente;
	 * Se i = 2, escrever os três valores a, b, c em ordem decrescente;
	 * Se i = 3, escrever os três valores a, b, c de forma que o maior entre a, b, c fique entre os outros dois, independente da ordem destes.
	 */
	public void imprimirNumeros() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de i:"));
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c:"));
		
		if (i == 1) {
			if (a > b && a > c && b > c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a > b && a > c && c > b) {
				System.out.println(a + " " + c + " " + b);	
			} else if (b > a && b > c && a > c) {
				System.out.println(b + " " + a + " " + c);
			} else if (b > a && b > c && c > a) {
				System.out.println(b + " " + c + " " + a);
			} else if (c > a && c > b && a > b) {
				System.out.println(c + " " + a + " " + b);
			} else if (c > a && c > b && b > a) {
				System.out.println(c + " " + b + " " + a);
			}
		} else if (i == 2) {
			if (a > b && a > c && b > c) {
				System.out.println(c + " " + b + " " + a);
			} else if (a > b && a > c && c > b) {
				System.out.println(b + " " + c + " " + a);	
			} else if (b > a && b > c && a > c) {
				System.out.println(c + " " + a + " " + b);
			} else if (b > a && b > c && c > a) {
				System.out.println(a + " " + c + " " + b);
			} else if (c > a && c > b && a > b) {
				System.out.println(b + " " + a + " " + c);
			} else if (c > a && c > b && b > a) {
				System.out.println(a + " " + b + " " + c);
			}
		} else if (i == 3) {
			if (a > b && a > c && b > c) {
				System.out.println(b + " " + a + " " + c);
			} else if (a > b && a > c && c > b) {
				System.out.println(c + " " + a + " " + b);	
			} else if (b > a && b > c && a > c) {
				System.out.println(a + " " + b + " " + c);
			} else if (b > a && b > c && c > a) {
				System.out.println(c + " " + b + " " + a);
			} else if (c > a && c > b && a > b) {
				System.out.println(a + " " + c + " " + b);
			} else if (c > a && c > b && b > a) {
				System.out.println(b + " " + c + " " + a);
			}
		}
	}
}