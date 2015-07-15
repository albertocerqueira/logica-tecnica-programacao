package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/21
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.calcularReajuste();
	}

	double bonus = 500;
	
	/**
	 * Uma empresa quer dar uma bonificação para determinados funcionários. Deverão receber um bônus de R$ 500,00 os funcionários com mais de 50 anos
	 * ou que trabalhem na empresa há pelo menos 5 anos. Escreva um programa que leia a idade, o tempo de serviço (em anos) e o salário do funcionário
	 * e imprima na tela o valor do bônus e do salário corrigido.
	 * DICA: Crie uma variável bônus com valor inicial de zero que será alterada se o funcionário preencher os requisitos para o aumento.
	 */
	public void calcularReajuste() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcion\u00e1rio: "));
		int t = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de servi\u00e7o do funcion\u00e1rio na empresa: "));
		double s = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal\u00e1rio do funcion\u00e1rio: "));
		
		double b = 0;
		if (i > 50) {
			s += bonus;
			b = bonus;
		} else if (t >= 5) {
			s += bonus;
			b = bonus;
		}
		
		System.out.println("O valor do b\u00d4nus \u00e9: R$" + b);
		System.out.println("O valor do sal\u00e1rio reajustado \u00e9: R$" + s);
	}
}