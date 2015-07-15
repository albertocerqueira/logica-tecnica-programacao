package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/08
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.sistemaDeRelatorio();
	}
	
	/**
	 * Uma loja deseja imprimir um relatório relativo às suas vendas em um ano. Escreva um programa que leia as seguintes informações para cada um
	 * dos 12 meses do ano: quantidade de dias úteis e o valor total das vendas da loja em cada dia útil. Seu programa deve calcular e imprimir na 
	 * tela:
	 * a.	O valor total vendido em cada mês;
	 * b.	O valor médio das vendas no mês.
	 * c.	O valor total vendido no ano;
	 */
	public void sistemaDeRelatorio() {
		String[] mes = new String[]{"Janeiro", "Fevereiro", "Mar\u00e7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int MESES = 12;
		double[][] valores = new double[MESES][31];// 31 é a quantidade máxima de dais em um mês.
		for (int x = 0; x < MESES; x++) {
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do  " + (x + 1) + "° m\u00eas:"));
			for (int y = 0; y < dias; y++) {
				valores[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de " + (y + 1) + "/" + mes[x] + ":"));
			}
		}
		
		double total = 0;
		for (int x = 0; x < MESES; x++) {
			double totalMes = 0;
			for (int y = 0, t = valores[x].length; y < t; y++) {
				totalMes += valores[x][y];
				System.out.println(valores[x][y]);
			}
			total += totalMes;
			System.out.println("Total vendido no m\u00eas " + mes[x] + ": " + totalMes);
		}
		
		System.out.println("Media mensal: " + (total / MESES));
		System.out.println("Total vendido no ano: " + total);
	}
}