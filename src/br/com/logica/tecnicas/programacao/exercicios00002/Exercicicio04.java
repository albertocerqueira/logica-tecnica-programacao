package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.mediaMensalidadeAcademia();
	}
	
	/**
	 * Escreva um programa que contenha uma função. Esta função deve receber 
	 * um número por parâmetro (representando uma data no formato ddmm), verificar se 
	 * a data é válida ou não. Caso a data seja válida retornar 1, caso contrário 
	 * retornar 0 se o mês for inválido ou retornar –1 caso o dia seja inválido. A função main() deve imprimir o valor de retorno. Para facilitar a consulta, essa função deve fazer uso de um vetor pré-definido com o número de dias de cada mês. Como exemplo de vetor: 
int total_dias={31,28,31,30,31,30,31,31,30,31,30,31}
	 */
	public void mediaMensalidadeAcademia() {
		double media;
		Integer mensalidade = 0, quantidadeMensalidades = 0, maior = 0, soma=0;
		do {
			quantidadeMensalidades++;
			if (mensalidade > maior) {
				maior = mensalidade;
			}
			soma += mensalidade;
			mensalidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da mensalidade da academia:"));
		} while (mensalidade > 1); {
			media = (soma / (quantidadeMensalidades - 1));
			System.out.println("A media dos valores da mensalidades \u00e9 de R$" + media);
			System.out.println("A maior mensalidade paga \u00e9 R$" + maior);
		}
	}
}