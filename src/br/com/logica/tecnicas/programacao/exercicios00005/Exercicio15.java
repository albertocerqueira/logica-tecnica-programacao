package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe15 = new Exercicio15();
		exe15.calcularPreco();
	}
	
	/**
	 * Uma loja de eletrodomésticos estabeleceu as seguintes modalidades de pagamento para a venda de suas mercadorias: 
	 * Número de parcelas	Preço Final
	 * À vista				Desconto de 2,5% sobre o preço da mercadoria;
	 * De 2 até 5 vezes		Preço da mercadoria, sem desconto ou acréscimo;
	 * De 6 até 10 vezes	Acréscimo de 6% sobre o preço da mercadoria;
	 * De 11 até 15 vezes	Acréscimo de 13% sobre o preço da mercadoria.
	 * 
	 * Exemplo:
	 * 		preço do produto = R$ 100,00
	 * 		forma de pagamento: em 8 vezes;
	 * 		preço total = 100,00 + 6,00 (6% de 100,00) = 106,00;
	 * 		cada parcela = 106,00 / 8 = R$ 13,25.
	 * 
	 * O programa deve ler o preço da mercadoria e o número de vezes em que o pagamento será feito e, depois, calcular e mostrar o valor de cada
	 * parcela, bem como o preço total da compra.
	 */
	public void calcularPreco() {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre\u00e7o da mercadoria: "));
		int q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas para pagamento: "));
		
		double vT = 0;
		if (q == 1) {
			vT = p * 0.985;
		} else if (q >= 2 && q <= 5) {
			vT = p;
		} else if (q >= 6 && q <= 10) {
			vT = p * 1.06;
		} else if (q >= 11 && q <= 15) {
			vT = p * 1.13;
		}
		
		System.out.println("O valor de cada parcela ser\u00e1: " + (vT / q));
	}
}