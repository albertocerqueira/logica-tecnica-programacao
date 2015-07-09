package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicicio23 {

	public static void main(String[] args) {
		Exercicicio23 exe23 = new Exercicicio23();
		exe23.verificarPermissaoDeEntradaParaFrequentadores();
	}
	
	/**
	 * Em geral, nas casas de espetáculos há enormes filas. Com o intuito de garantir a rápida entrada dos freqüentadores um dos seguranças recolhe 
	 * as carteiras de identidade e outro segurança verifica pelo ano de nascimento se o pretenso freqüentador, poderá entrar ou não. Contudo, o 
	 * segundo segurança demora muito para fazer a verificação. Por isso, você foi contratado para criar um programa que leia uma única vez: a idade
	 * mínima e o ano atual. Depois, o programa deverá permitir a leitura do ano de nascimento do freqüentador e informar se ela pode ou não entrar. 
	 * Seu programa deverá parar quando um número inválido para o ano de nascimento for digitado. Por exemplo, se num determinado show a idade mínima
	 * é de 14 anos e o ano atual é 2009, então, as entradas abaixo informarão que 
	 * 
	 * 1993 – Permitida 
	 * 1996 – Não Permitida 
	 * 1990 – Permitida 
	 * 2010 ou -1 – O programa pára de ser executado. 
	 */
	public void verificarPermissaoDeEntradaParaFrequentadores() {
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade m\u00ednima para o evento: "));
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		while (true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do frequentador: "));
			
			if (n > a) {
				break;
			} else if (m > (a - n)) {
				System.out.println("N\u00e3o permitida");
			} else {
				System.out.println("Permitida");
			}
		}
	}
}