package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/06
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.procurarNumeroAleatorio();
	}
	
	/**
	 * Escreva um programa que armazene em um vetor números entre 1 e 50. Depois o programa deve permitir que o usuário digite um valor e pesquisar 
	 * no vetor se o número digitado existe. Caso o número exista deve ser impresso na tela a posição em que se encontra. Caso o número não exista 
	 * de ser impresso na tela uma mensagem informando que o número não existe no vetor
	 */
	public void procurarNumeroAleatorio() {
		int[] ns = RandomUtils.gerarNumerosAleatorios(50, 1, 50);// Apenas encapsulando a criação de números aleatórios.
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		int e = 0;
		for (int x = 0, y = ns.length; x < y; x++) {
			if (n == ns[x]) {
				System.out.println("O n\u00famero " + n + " foi encontrado na " + (x + 1) + "° posi\u00e7\u00e3o.");
				e = 1;
				break;
			}
		}
		
		if (e == 0) {
			System.out.println("O n\u00famero " + n + " n\u00e3o foi encontrado!!!");
		}
	}
}