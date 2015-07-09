package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.pesquisaDePrecoElucros();
	}
	
	/**
	 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto mandou você fazer um programa que leia o 
	 * código do produto (um número inteiro), preço de compra e preço de venda dos produtos. Seu programa deve determinar e imprimir quantas 
	 * mercadorias possui:
	 * 
	 * • Porcentagem_lucro < 10%
	 * • 10% <= Porcentagem_ lucro <= 20%
	 * • Porcentagem_lucro > 20%
	 * 
	 * Determine o produto com maior valor de venda (imprima na tela o maior valor e o código deste produto) e o produto com menor valor de venda 
	 * (imprima na tela o menor valor e o código deste produto). Determine e imprima também a média dos lucros dos produtos. 
	 * 
	 * Importante: O programa deve ler as informações das mercadorias enquanto não for digitado um código de produto negativo. 
	 */
	public void pesquisaDePrecoElucros() {
		int c = 0, maiorc = 0, menorc = 0, q = 0, m1 = 0, m2 = 0, m3 = 0;
		double maiorv = 0, menorv = 0;
		while (c >= 0) {
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite o c\u00f3digo do produto: "));
			if (c > 0) {
				double pc = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre\u00e7o de compra do produto: "));
				double pv = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre\u00e7o de venda do produto: "));
				
				if (maiorv < pv) {
					maiorv = pv;
					maiorc = c;
				}
				
				if (menorv > pv || q == 0) {
					menorv = pv;
					menorc = c;
				}
				
				double lucro = ((pv * 100) / pc) - 100;
				
				if (lucro < 10) {
					m1++;
				} else if (lucro >= 10 && lucro <= 20) {
					m2++;
				} else if (lucro > 20) {
					m3++;
				}
			}
		}
		
		System.out.println(m1 + " produto com margem de lucro abaixo de 10%.");
		System.out.println(m2 + " produto com margem de lucro entre 10% e 20%.");
		System.out.println(m3 + " produto com margem de lucro acima de 20%.");
		System.out.println("O produto com maior valor \u00e9 " + maiorc + " que custa R$" + maiorv);
		System.out.println("O produto com menor valor \u00e9 " + menorc + " que custa R$" + menorv);
	}
}