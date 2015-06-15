package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio25 {

	public static void main(String[] args) {
		Exercicicio25 exe25 = new Exercicicio25();
		exe25.buscarValoresNaMedia();
	}

	/**
	 * Fazer um programa, usando vetores, que leia 100 valores entre 0.0 e 10.0. Depois, verificar a quantidade de elementos no vetor que são maiores
	 * que 4.0 e menores que 7.0.
	 */
	public void buscarValoresNaMedia() {
		int qn = 3;
		double[] ns = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = -1;
			while (n < 0 || n > 10) {
				n = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero real qualquer entre (0.0 e 10.0): "));
			}
			ns[x] = n;
		}
		
		int q = 0;
		for (int x = 0; x < qn; x++) {
			double n = ns[x];
			if (n >= 4 && n <= 10) {
				q++;
			}
		}
		
		System.out.println("Há " + q + " n\u00fameros entre 4.0 e 10.0.");
	}
}