package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe15 = new Exercicio15();
		exe15.calculoPorcentagemDeAlunosReprovados();
	}
	
	/**
	 * Em uma disciplina estavam matriculados 82 alunos. Deste total, 30 alunos foram reprovados. Escreva um programa que calcule e imprima na tela a 
	 * porcentagem de alunos reprovados. (deverá aparecer 36.58%).
	 */
	public void calculoPorcentagemDeAlunosReprovados() {
		double p = ((30.0 * 100.0) / 82.0);
		System.out.println("A porcentagem de alunos reprovados \u00e9 " + p + ".");
	}
}