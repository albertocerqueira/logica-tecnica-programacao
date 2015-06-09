package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe09 = new Exercicicio13();
		exe09.mediaNumeros();
	}
	
	/**
	 * Considere um cinema a respeito do qual foi feita uma pesquisa de qualidade. Certo dia, cada espectador respondeu um questionário, no qual
	 * constava sua opinião em relação ao filme, segundo as seguintes notas:
	 * Nota	Significado
	 * A	Ótimo
	 * B	Regular
	 * C	Ruim
	 * F	Fim da digitação dos dados
	 * 
	 * Elabore um programa que, lendo esse dado fornecido pelos espectadores, calcule e imprima:
	 * •	A quantidade de pessoas que participaram da pesquisa;
	 * •	A percentagem de respostas “ótimo” (notas A);
	 * •	A percentagem de respostas “regular” (notas B);
	 * •	A percentagem de respostas “ruim” (notas C).
	 * Quando for digitada uma nota F, significará que a apuração dos dados chegou ao fim.
	 * IMPORTANTE: Se a nota não pertencer ao conjunto, a pergunta deverá ser repetida até o entrevistado responder corretamente.
	 */
	public void mediaNumeros() {
		String n = "F";
		int a = 0, b = 0, c = 0, q = 0;
		do {
			n = JOptionPane.showInputDialog("Participante " + (q + 1) + " digite sua nota a respeito do filme:\n(A) Ótimo\n(B) Regular\n(C) Ruim\n(F) Sair");
			if (n.equalsIgnoreCase("A")) {
				a++;
				q++;
			} else if (n.equalsIgnoreCase("B")) {
				b++;
				q++;
			} else if (n.equalsIgnoreCase("C")) {
				c++;
				q++;
			}
		} while (!n.equalsIgnoreCase("F"));
		System.out.println("A quantidade de pessoas que participaram da pesquisa \u00e9: " + q);
		System.out.println(((a * 100) / q) + "% deram uma nota A.");
		System.out.println(((b * 100) / q) + "% deram uma nota B.");
		System.out.println(((c * 100) / q) + "% deram uma nota C.");
	}
}