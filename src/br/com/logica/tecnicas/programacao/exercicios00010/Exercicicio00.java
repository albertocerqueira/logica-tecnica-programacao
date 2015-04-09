package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/08
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.pesquisarMensalidadeDeAcademias();
	}
	
	/**
	 * Em Agosto um professor deseja finalmente começar a fazer uma academia e para isso realizou uma pesquisa de valores de mensalidade. Você deve 
	 * escrever um programa que contenha uma função. Essa função deve permitir ao professor utilizá-la enquanto digitar valores válidos. A função 
	 * deve ler uma quantidade não determinada de valores de mensalidades das academias pesquisadas. Calcular e imprimir na tela:
	 * a.	a media entre os valores de mensalidades pesquisadas;
	 * b.	o maior valor de mensalidade pesquisada.
	 * Obs.: A função deve encerrar a leitura quando for digitado um valor negativo ou igual a zero.
	 */
	public void pesquisarMensalidadeDeAcademias() {
		double valor = 0, maior = 0, total = 0, quantidade = 0;
		do {
			quantidade++;
			total += valor;
			if (maior < valor) {
				maior = valor;
			}
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da academia:"));
		} while (valor > 0);
		
		System.out.println("A maior mensalidade encontrada foi: " + maior);
		System.out.println("A media entre os valores de mensalidades pesquisadas \u00e9: " + (total / (quantidade - 1)));
	}
}