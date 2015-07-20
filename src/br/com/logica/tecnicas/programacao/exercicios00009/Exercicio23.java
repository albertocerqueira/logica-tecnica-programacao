package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.pesquisaHabitacional();
	}
	
	/**
	 * Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M / F) e salário. Fazer um programa que 
	 * informe:
	 * 
	 * a. A média de salário do grupo; 
	 * b. Maior e menor idade do grupo; 
	 * c. Quantidade de mulheres com salário até R$1.000,00;
	 * d. Quantidade de pessoas entrevistadas;
	 * 
	 * Encerrar a entrada de dados quando for digitada uma idade negativa.
	 */
	public void pesquisaHabitacional() {
		int q = 0, ma = 0, me = 0, qm = 0, ss = 0;
		while (true) {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do habitante: "));
			if (i < 0) {
				break;
			}
			
			String se = JOptionPane.showInputDialog("Digite o sexo do habitante (M / F): ");
			double sa = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal\u00e1rio do habitante: "));
			
			if (ma < i) {
				ma = i;
			}
			
			if (me > i || q == 0) {
				me = i;
			}
			
			if (se.equalsIgnoreCase("F") && sa < 1000) {
				qm++;
			}
			
			ss += sa;
			q++;
		}
		
		System.out.println("A m\u00e9dia dos sal\u00e1rios \u00e9 " + (ss / q));
		System.out.println("A maior idade \u00e9 " + ma);
		System.out.println("A menor idade \u00e9 " + me);
		System.out.println("A quantidade de melheres com sal\u00e1rio at\u00e9 R$1.000,00 \u00e9 " + qm);
		System.out.println("Foram envtrevistado " + q + " pessoas.");
	}
}