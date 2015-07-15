package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.calculadora();
	}
	
	/**
	 * Implemente o programa da calculadora utilizando uma instrução switch-case para determinar a operação que deve ser executada, conforme a 
	 * escolha do usuário no menu de opções. O usuário deve fornecer dois números. Obs.: Lembre-se que na operação de divisão o segundo número deve 
	 * ser diferente de zero. 
	 * 
	 * Menu:
	 * (+) Somar
	 * (-) Subtrair
	 * (x) Multiplicar
	 * (/) Dividir
	 * (%) Resto da divisão
	 */
	public void calculadora() {
		double o1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		String o = JOptionPane.showInputDialog("Digite o tipo de opera\u00e7\u00e3o (+ - x / %): ");
		double o2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		switch (o) {
			case "+":
				System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 + o2));
				break;
			case "-":
				System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 - o2));
				break;
			case "x":
				System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 * o2));
				break;
			case "/":
				if (o2 != 0) {
					System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 / o2));
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			case "%":
				if (o2 != 0) {
					System.out.println(o1 + " " +  o + " " +  o2 + " = " + (o1 % o2));
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			default:
				System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
		}
	}
}