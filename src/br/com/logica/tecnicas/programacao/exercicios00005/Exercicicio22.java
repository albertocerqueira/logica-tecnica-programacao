package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.verificarValidadeDoProduto(23, 6);
	}
	
	/**
	 * O prazo de validade de um produto pode ser determinado calculando-se o número de dias que há entre a data de hoje e a data de validade do 
	 * produto. Por exemplo: se hoje é 17 de março de 2005 e a data de validade do produto é 22 de março de 2005, o prazo de validade desse produto
	 * é 5 dias (22 – 17). O dono de um mini–mercado deseja que você escreva um programa que indique se o produto poderá ser vendido a preço normal,
	 * em liquidação ou será recolhido, conforme descrição a seguir:
	 * 
	 * Preço Normal: Se o prazo de validade do produto for igual ou superior a 1 mês;
	 * Liquidação: Se o prazo de validade estiver entre 7, inclusive, e 29 dias, haverá redução de 50% no preço;
	 * Recolhimento: Se o prazo de validade for menor que 7 dias, todos os itens do produto deverão ser recolhidos das prateleiras.
	 * 
	 * OBS. Considere que qualquer mês tem exatamente 30 dias.
	 */
	public void verificarValidadeDoProduto(int dia, int mes) {
		Integer d = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do vencimento do produto: "));
		Integer m = Integer.parseInt(JOptionPane.showInputDialog("Digite o m\u00eas de vencimento do produto (n\u00famero): "));
		
		int dias = 0;
		if (m <= mes) {
			dias = ((mes - m) * 30) + (dia - d);
		}
		
		if (dias > 30) {
			System.out.println("Pre\u00e7o normal");
		} else if (dias >= 7 && dias < 30) {
			System.out.println("Liquida\u00e7\u00e3o");
		} else {
			System.out.println("Recolhimento");
		}
	}
}