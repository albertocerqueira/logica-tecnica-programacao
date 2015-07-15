package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/28
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.verificacaoParaDoacaoDeSangue();
	}

	/**
	 * Para ser apta a doar sangue a pessoa deve ter entre 18 e 65 anos e pesar no mínimo 50kg. Escreva um programa que leia a idade da pessoa e
	 * mostre na tela a mensagem “Você não pode ser doadora porque sua idade não permite” caso a idade não esteja no intervalo exigido. Caso a
	 * entrada seja válida, seu programa deverá ler o peso da pessoa. Se o peso for inferior a 50 quilos, a mensagem “Você não pode ser doadora
	 * porque seu peso não permite” ou “Parabéns! Você eh candidato a doador”.
	 */
	public void verificacaoParaDoacaoDeSangue() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
		if (i >= 18 && i <= 65) {
			double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa: "));
			if (p < 50) {
				System.out.println("Voc\u00ea n\u00e3o pode ser doadora porque seu peso n\u00e3o permite.");
			} else {
				System.out.println("Parab\u00e9ns! Voc\u00ea \u00e9 candidato a doador.");
			}
		} else {
			System.out.println("Voc\u00ea n\u00e3o pode ser doadora porque sua idade n\u00e3o permite.");
		}
	}
}