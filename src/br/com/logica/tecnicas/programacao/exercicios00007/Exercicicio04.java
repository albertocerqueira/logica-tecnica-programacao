package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/31
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.calculoFaturamentoSemanal();
	}
	
	/**
	 * Escreva um programa para calcular o total do faturamento de cada filial de uma loja durante sete dias. A função principal deve ler o 
	 * faturamento diário das 10 filiais durante sete dias, guardar em uma matriz (10 x 7) e chamar a função calculaTotal( ), passando a matriz 
	 * como parâmetro. A função calculaTotal() deve calcular e mostrar o faturamento total de cada filial e o faturamento total da loja.
	 */
	public void calculoFaturamentoSemanal() {
		int DIAS = 7 , FILIAIS = 10;
		int faturamento[][] = new int[DIAS][FILIAIS];
		for (int x = 0; x < DIAS; x++) {
			for (int y = 0; y < FILIAIS; y++) {
				Integer faturamentoDia = Integer.parseInt(JOptionPane.showInputDialog("Digite o faturamento do " + (x + 1) + "° dia da semana da " + (y + 1) + "° filial: "));
				faturamento[x][y] = faturamentoDia;
			}
		}
		calculaTotal(FILIAIS, faturamento);
	}
	
	public void calculaTotal(int FILIAIS, int[][] faturamento) {
		int faturamentoFiliais[] = new int[FILIAIS];
		int total = 0;
		for (int x = 0, i = faturamento.length; x < i; x++) {
			for (int y = 0, l = faturamento[x].length; y < l; y++) {
				faturamentoFiliais[y] += faturamento[x][y];
				total += faturamento[x][y];
				
				System.out.print(faturamento[x][y] + " - ");
			}
			System.out.println();
		}
		
		for (int y = 0; y < FILIAIS; y++) {
			System.out.println("O faturamento da " + (y + 1) + "° filial \u00e9 " + faturamentoFiliais[y]);
		}
		
		System.out.println("O faturamento total \u00e9 " + total);
	}
}