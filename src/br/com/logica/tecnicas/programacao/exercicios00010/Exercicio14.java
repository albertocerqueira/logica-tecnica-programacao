package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Exercicio14 exe14 = new Exercicio14();
		exe14.calculoNovosSalarios();
	}
	
	/**
	 * Uma empresa pretende diminuir a diferença entre o salário de seus funcionários e decidiu dar aumentos proporcionais da seguinte forma:
	 * 
	 * salário bruto R$500.00 : Aumento de 15%
	 * salário bruto R$900.00 : Aumento de 10%
	 * salário bruto R$1500.00: Aumento de 5%
	 * 
	 * Com base nestes índices, escreva um programa que calcule e imprima na tela os três novos salários. (deverá ser impresso na tela, R$ 575.00, 
	 * R$ 990.00 e R$ 1575.00.)
	 */
	public void calculoNovosSalarios() {
		System.out.println("De R$ 500,00 para " + (500 * 1.15));
		System.out.println("De R$ 900,00 para " + (900 * 1.1));
		System.out.println("De R$ 1500,00 para " + (1500 * 1.05));
	}
}