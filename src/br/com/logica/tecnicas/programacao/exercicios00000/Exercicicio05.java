package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/26
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.calcularMediaDaSala();
	}
	
	/**
	 * Escreva um programa que leia as notas de duas provas de 80 alunos, armazene em uma matriz, calcule a média de cada aluno, armazene na terceira 
	 * coluna da matriz e mostre essa matriz.
	 */
	public void calcularMediaDaSala() {
		int linha = 80, coluna = 3;
		double[][] aluno = new double[linha][coluna];
		for (int i = 0 ; i < linha ; i++) {
			for (int j = 0 ; j < coluna - 1 ; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j + 1) + "° nota do " + (i + 1) + "° aluno:"));
				aluno[i][j] = nota;
			}
		}

		for (int i = 0 ; i < linha ; i++) {
			aluno[i][2] = (aluno[i][0] + aluno[i][1]) / 2;
		}
		
		System.out.println("Aluno\tP1\tP2\tMedia");
		for (int i = 0 ; i < linha ; i++) {
			System.out.println((i + 1) + "°\t" + aluno[i][0] + "\t" + aluno[i][1] + "\t" + aluno[i][2]);
		}
	}
}