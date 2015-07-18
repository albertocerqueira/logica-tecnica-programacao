package br.com.logica.tecnicas.programacao.exercicios00009;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/17
 */
public class Exercicio11 {

	public static void main(String[] args) {
		Exercicio11 exe11 = new Exercicio11();
		exe11.contagemNumerosAleatorios();
	}
	
	/**
	 * Faça um programa para contar quantos números são gerados aleatoriamente até que um valor igual ao informado pelo usuário tenha sido gerado. 
	 * O usuário irá digitar um valor entre 1 e 5000 e o programa deverá gerar valores nesse intervalo enquanto não acertar o número digitado. 
	 * Quando acertar, o programa deve informar quantos números foram gerados aleatoriamente.
	 */
	public void contagemNumerosAleatorios() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer (entre 1 e 5000): "));
		Random r = new Random();
		int a = r.nextInt(5000);
		int q = 1;
		while (a != n) {
			a = r.nextInt(5000);
			q++;
		}
		
		System.out.println("Foram gerador " + q + " n\u00fameros aleat\u00f3rios.");
	}
}