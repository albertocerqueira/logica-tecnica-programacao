package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/22
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.pesquisaDeQualidade();
	}

	/**
	 * Considere um cinema a respeito do qual foi feita uma pesquisa de qualidade. Certo dia, cada espectador respondeu a um questionário, no qual
	 * constava sua opinião em relação ao filme, segundo as seguintes notas:
	 * Nota Significado
	 * 1 	Ótimo
	 * 2 	Regular
	 * 3 	Ruim
	 * -1 	Fim da digitação dos dados
	 * 
	 * Elabore um programa que, lendo esse dado fornecido pelos espectadores, calcule e imprima:
	 * • A quantidade de pessoas que participaram da pesquisa;
	 * • A quantidade de respostas “ótimo” (notas 1);
	 * • A quantidade de respostas “regular” (notas 2);
	 * • A quantidade de respostas “ruim” (notas 3).
	 * 
	 * Quando for digitada uma nota -1, significa que a apuração dos dados chegou ao fim. Sabemos que a quantidade de entrevistados é maior ou
	 * igual a 1.
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
		if (ot > 1) {
			System.out.println(ot + " responderam que o filme foi \u00f3timo, " + re + " para regular e " + ru + " para ruim.");
		} else {
			System.out.println(ot + " respondeu que o filme foi \u00f3timo, " + re + " para regular e " + ru + " para ruim.");
		}
	}
}