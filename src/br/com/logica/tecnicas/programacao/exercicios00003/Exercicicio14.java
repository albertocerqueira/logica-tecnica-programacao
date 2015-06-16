package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/15
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe14 = new Exercicicio14();
		exe14.pesquisarIdades();
	}

	/**
	 * Escreva um programa que permita a leitura dos 80 números (inteiros) dos deputados federais investigados pelo Ministério Público e os armazene
	 * em um vetor. Depois o programa deve permitir uma consulta, lendo o número do deputado em que o usuário votou, para verificar se este está
	 * sendo investigado ou não (ou seja, verificar se o número pertence ou não ao vetor) imprimindo uma mensagem informando.
	 */
	public void pesquisarIdades() {
		int qn = 3;
		
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero do " + (x + 1) + "° deputado: "));
			ns[x] = n;
		}
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero do deputado para consulta: "));
		int e = 0;
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n == c) {
				e = 1;
			}
		}
		
		if (e == 1) {
			System.out.println("Este deputado est\u00e1 sobre investiga\u00e7\u00e3o.");
		}
	}
}