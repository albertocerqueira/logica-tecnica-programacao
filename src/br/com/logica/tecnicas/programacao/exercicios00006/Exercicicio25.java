package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicicio25 {

	public static void main(String[] args) {
		Exercicicio25 exe25 = new Exercicicio25();
		exe25.calcularPorcentagemDeFaltas();
	}
	
	/**
	 *  Um aluno deseja saber qual a porcentagem de faltas que ele tem em cada disciplina. Ajude esse aluno fazendo um programa para que ele sempre 
	 *  possa calcular sua porcentagem de faltas. Para isso, escreva um programa que leia a carga horária da disciplina e a quantidade de faltas 
	 *  acumuladas, calcule a porcentagem e a imprima na tela. 
	 */
	public void calcularPorcentagemDeFaltas() {
		int h = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga hor\u00e1ria da disciplina: "));
		int f = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas (em horas): "));
		
		System.out.println("Voc\u00ea esteve ausente em " + ((f * 100) / h) + "% da mat\u00e9ria.");
	}
}