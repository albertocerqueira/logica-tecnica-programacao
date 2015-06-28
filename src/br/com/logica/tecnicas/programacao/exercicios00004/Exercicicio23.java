package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/28
 */
public class Exercicicio23 {

	public static void main(String[] args) {
		Exercicicio23 exe23 = new Exercicicio23();
		exe23.verificarIndiceUVB();
	}

	/**
	 * Uma pessoa com problema de pele necessita saber seu nível de risco ao se expor ao sol e qual o tempo máximo de exposição. Crie para ela um
	 * programa que imprima as informações de acordo com a tabela abaixo, após ler um número inteiro que corresponde ao índice UV–B.
	 * 
	 * Índice UV–B	Nível de Risco	Tempo Máximo de Exposição (minutos)
	 * 0 – 2		Mínimo			30
	 * 3 – 4		Baixo			17.5
	 * 5 – 6		Moderado		11
	 * 7 – 9		Alto			7.5
	 */
	public void verificarIndiceUVB() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o \u00edndice UV–B: "));
		
		if (i >= 0 && 2 >= i) {
			System.out.println("M\u00ednimo");
		} else if (i >= 3 && 4 >= i) {
			System.out.println("Baixo");
		} else if (i >= 5 && 6 >= i) {
			System.out.println("Moderado");
		} else if (i >= 7 && 9 >= i) {
			System.out.println("Alto");
		}
	}
}