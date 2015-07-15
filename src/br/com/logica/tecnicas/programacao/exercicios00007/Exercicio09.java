package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.principal();
	}
	
	/**
	 * Construa um programa que contenha 3 funções: principal, soma e subtrai.
	 * •	principal é a main(): essa função contém um menu, que se o usuário digitar 1, a função soma() será chamada. Se a pessoa digitar 2, será 
	 * chamada a função subtrai(), se a pessoa digitar 3, haverá a saída do programa.
	 * •	soma(): lê dois números reais, calcula e mostra a soma desses números;
	 * •	subtrai(): lê dois números reais, calcula e mostra a subtração do primeiro pelo segundo.
	 */
	public void principal() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("###DIGITE 1 PARA SOMA 2 N\u00daMEROS!!!###\n##### 2 PARA SUBTRAIR 2 N\u00daMEROS!!!###\n####### 3 PARA SAIR DO PROGRAMA!!!###"));
		if (n == 1) {
			System.out.println("A soma dos n\u00fameros \u00e9 " + soma() + ".");
		} else if (n == 2) {
			System.out.println("A subtra\u00e7\u00e3o dos n\u00fameros s\u00e3o " + subtrair() + ".");
		} else if(n == 3) {
			System.out.println("### VOC\u00ca ENCERROU O PROGRAMA!!!###");
		}
	}
	
	public int soma() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero:"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero:"));
		return n1 + n2;
	}
	
	public int subtrair() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero:"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero:"));
		return n1 - n2;
	}
}