package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/22
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.pesquisaDeQualidade();
	}

	/**
	 * Modifique o exercício br.com.logica.tecnicas.programacao.exercicios00004.Exercicicio10 para calcular as porcentagens de notas ótimo, bom e
	 * ruim, mostre os valores e indique qual foi a opinião do público.
	 */
	public void pesquisaDeQualidade() {
		int n = 0, q = 0, ot = 0, re = 0, ru = 0;
		while (n != -1) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do cinema: "));
			if (n != -1) {
				q++;
				if (n == 1) {
					ot++;
				} else if (n == 2) {
					re++;
				} else if (n == 3) {
					ru++;
				}
			}
		}
		
		System.out.println(q + " participaram da pesquisa.");
		System.out.println((ot * 100) / q + "% responderam que o filme foi \u00f3timo, " + (re * 100) / q + "% para regular e " + (ru * 100) / q + "% para ruim.");
	}
}