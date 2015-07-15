package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calculandoIdade();
	}
	
	/**
	 * Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar antes se o ano de 
	 * nascimento é um ano válido.  
	 * 
	 * IMPORTANTE: Seu programa não deverá imprimir a idade se o ano de nascimento for inválido, mas, a mensagem “Data de nascimento inválida”.  
	 */
	public void calculandoIdade() {
		int ap = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento da pessoa: "));
		int aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		if (ap > aa) {
			System.out.println("Data de nascimento inv\u00e1lido.");
		} else {
			System.out.println("Idade: " + (aa - ap));
		}
	}
}