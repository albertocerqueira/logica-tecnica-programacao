package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/06
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.calculandoValorDoIMC();
	}
	
	/**
	 * Escreva um programa que leia um número indeterminado de informações de alunos de uma academia: peso e altura. O programa deve também: calcular
	 * o IMC (segundo a fórmula dada) e escrever na tela a faixa de risco de cada um (segundo a tabela abaixo);
	 * 
	 * • contar quantos IMCs foram calculados;
	 * • calcular a porcentagem de alunos com peso abaixo do normal;
	 * • imprimir o peso do aluno mais pesado;
	 * • imprimir o peso do aluno com menor IMC;
	 * • quando o valor do peso ou o valor da altura recebido por parâmetro forem inválidos apresentar a média do IMC dos alunos da academia que 
	 * participaram da pesquisa.
	 * 
	 * Obs: O programa deve parar de repetir o procedimento quando forem digitados números inválidos para o peso ou para a altura (menor que 20 para
	 * o peso e menor que 1.0 para a altura).
	 * 
	 * IMC = peso / altura²
	 * 
	 * Valor do IMC		Faixa de Risco
	 * IMC < 20			abaixo do peso
	 * 20 ≤ IMC ≤ 25	Normal
	 * IMC > 25			acima do peso
	 */
	public void calculandoValorDoIMC() {
		int q = 0, bp = 0;
		double ap = 0, imcm = 0, pm = 0, simc = 0;
		while (true) {
			double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do aluno: "));
			double a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do aluno: "));
			
			if (p == 20 || a == 1) {
				break;
			} else {
				q++;
				double imc = (p / (a * a));
				simc += imc;
				System.out.println("IMC: " + imc);
				
				if (imc < 20) {
					bp++;
				}
				
				if (ap < p) {
					ap = p;
				}
				
				if (q == 1 || imcm > imc) {
					imcm = imc;
					pm = p;
				}
			}
		}
		
		System.out.println(q + " IMC's foram calculados.");
		System.out.println("Temos " + ((bp * 100) / q) + "% abaixo do peso.");
		System.out.println(ap + "Kg pesa o aluno mais pesssado.");
		System.out.println("O peso do aluno com menor IMC \u00e9 " + pm + "Kg.");
		System.out.println("A academia tem uma m\u00e9dia de " + (simc / q) + " valor IMC.");
	}
}