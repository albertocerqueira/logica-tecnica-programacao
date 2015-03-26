package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/25
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.somaNezimoTermo();
	}

	/**
	 *  Faça um programa que leia o gênero (0 para masculino ou 1 para feminino) e a cor dos cabelos 
	 *  (0 para louro, 1 para preto, 2 para ruivo ou 3 para castanho) de 100 pessoas e diga quantas 
	 *  ruivas existem.
	 */
	public void somaNezimoTermo() {
		int ruivas = 0;
		for (int x = 0; x < 100; x++) {
			Integer sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite para o sexo -> 0 para masculino e 1 para feminino.\nDigite o sexo da pessoa:"));
			Integer cabelo = Integer.parseInt(JOptionPane.showInputDialog("Digite para o cor do cabelo -> 0 para louro, 1 para preto, 2 para ruivo e 3 para castanho.\nDigite a cor do cabelo da pessoa:"));

			if (sexo == 1 && cabelo == 2) {
				ruivas++;
			}
		}
		System.out.println("Temos na pesquisa um total de " + ruivas + " ruivas.");
	}
}