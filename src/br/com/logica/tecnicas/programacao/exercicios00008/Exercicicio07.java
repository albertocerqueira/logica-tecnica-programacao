package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.verificarVetor();
	}
	
	/**
	 * Este programa lê um vetor de inteiros (10 elementos) e imprime na tela os valores lidos. Depois lê um valor e procurar este valor no vetor.
	 * Ao encontrar o primeiro valor igual, imprime a posição (ou índice). Se não encontrar este valor no vetor, imprimir na tela uma mensagem que 
	 * não achou.
	 */
	public void verificarVetor() {
		int flag = -1;
		int[] num = new int[10];
		System.out.println("Informe 10 valores inteiros para inicializar o vetor:");
		for (int i = 0; i < 10; i++) {
			Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° n\u00famero:"));
			num[i] = n;
		}
		System.out.println("Valores lidos:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Lido na " + (i + 1) + "° posi\u00e7\u00e3o \u00e9 " + num[i]);
		}
		Integer procurado = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a procurar:"));
		for (int i = 0; i < 10; i++) {
			if ((procurado == num [i]) && (flag==-1)) {
				System.out.println("O valor " + num[i] + " foi encontrado na " + (i + 1) + "° posi\u00e7\u00e3o.");
				flag=i;
			}
		}
		if (flag == -1 ) {
			System.out.println("Valor n\u00e3o encontrado...");
		}
	}
}