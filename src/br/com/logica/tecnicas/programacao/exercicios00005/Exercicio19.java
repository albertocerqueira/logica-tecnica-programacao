package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calcularBonusDeNatal();
	}
	
	/**
	 * Fazer um programa capaz de ler uma expressão matemática simples (operando1 operador operando2) onde operando1 e operando2 são valores reais e 
	 * operador é um dos símbolos da álgebra (representados pelos caracteres ‘+’, ’-’, ’*’, ’/’). Se o usuário tiver digitado um operador válido, seu
	 * programa deverá calcular e mostrar na tela o resultado da operação no seguinte formato: 
	 * operando1 operador operando2 = resultado 
	 * caso o operador não exista, deverá aparecer na tela: “OPERACAO INVALIDA”
	 * OBS. Cuidado com a divisão por zero.
	 */
	public void calcularBonusDeNatal() {
		double o1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		String o = JOptionPane.showInputDialog("Digite o tipo de opera\u00e7\u00e3o (+ - x /): ");
		double o2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		if (o.equals("+")) {
			System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 + o2));
		} else if (o.equals("-")) {
			System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 - o2));
		} else if (o.equals("/")) {
			if (o2 != 0) {
				System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 / o2));
			} else {
				System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
			}
		} else if (o.equals("x")) {
			System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 * o2));
		} else {
			System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
		}
	}
}