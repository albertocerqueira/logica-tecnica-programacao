package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/21
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.calcularDesconto();
	}

	int porcentagem = 10;
	
	/**
	 * Uma loja está fazendo uma promoção: se o cliente fizer compras com valores acima de R$ 150,00, a loja dá um desconto de 10%. Escreva um
	 * programa que leia o valor total da compra e imprima o valor do desconto e o total a ser pago (independentemente do valor da compra).
	 * DICA: Crie uma variável porcentagem com valor zero que receberá o valor 10% se a compra for maior que R$ 150,00.
	 */
	public void calcularDesconto() {
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		
		double d = 0;
		if (c >= 150) {
			d = (c * porcentagem) / 100;
		}
		
		System.out.println("O valor do desconto \u00e9: R$" + d);
		System.out.println("O valor total a ser pago \u00e9: R$" + (c - d));
	}
}