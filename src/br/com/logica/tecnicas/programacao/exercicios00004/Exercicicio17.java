package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/24
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.calculoDeImposto();
	}

	/**
	 * Um fabricante vendeu 120 unidades de um produto que custa R$ 40,00. Sobre o valor vendido, o fabricante paga 40% de imposto. Escreva um 
	 * programa que calcule o valor de imposto a ser pago.
	 */
	public void calculoDeImposto() {
		System.out.println("O fabricante paga R$" + (120 * 40) * 0.4 + " em imposto.");
	}
}