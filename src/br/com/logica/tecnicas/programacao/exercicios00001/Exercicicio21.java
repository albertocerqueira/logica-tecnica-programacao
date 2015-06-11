package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

import br.com.logica.tecnicas.programacao.extras.RaizQuadrada;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.calcularRaizQuadrada();
	}

	/**
	 * No exercício br.com.logica.tecnicas.programacao.exercicios00001.Exercicicio17, você obrigou o usuário a digitar um número positivo antes de
	 * lhe mostrar a raiz quadrada do número digitado, modifique o programa para que este permita ler até 20 números reais e mostre a raiz quadrada.
	 * Se por algum acaso o usuário digitar um número negativo, o programa deverá mostrar a mensagem "Abortando o programa" e sair imediatamente
	 * para o sistema.
	 */
	public void calcularRaizQuadrada() {
		int qn = 3;
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + x + "° n\u00famero real positivo qualquer:"));
			if (n > 0) {
				ns[x] = n;
			} else {
				System.out.println("Abortando o programa");
				return;
			}
		}
		
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			System.out.println("Raiz quadrada de " + n + " \u00e9: " + RaizQuadrada.get(ns[x]));
		}
	}
}