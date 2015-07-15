package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/25
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Exercicio05 exe05 = new Exercicio05();
		exe05.armazenarVendasNoMesDeMarco();
	}

	/**
	 * Uma loja de discos anota diariamente durante o mês de março a quantidade de discos vendidos. 
	 * Determinar em que dia desse mês ocorreu a maior venda e qual foi a quantidade de discos vendida nesse dia. 
	 */
	public void armazenarVendasNoMesDeMarco() {
		int maiorQuantidade = 0, maiorVendaDia = 0;
		Integer[] vendasDias = new Integer[31];
		for (int x = 0; x < 3; x++) {
			Integer quantidadeDiscos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de discos vendido no " + (x + 1) + "° dia:"));
			vendasDias[x] = quantidadeDiscos;

			if (quantidadeDiscos > maiorQuantidade) {
				maiorQuantidade = quantidadeDiscos;
				maiorVendaDia = x + 1;
			}
		}
		System.out.println("A maior venda realizado foi no dia " + maiorVendaDia + " sendo " + maiorQuantidade + " discos vendidos.");
	}
}