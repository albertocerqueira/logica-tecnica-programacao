package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.verificarTipoDeTempestade();
	}
	
	/**
	 * Um ciclone tropical consiste em uma tempestade muito violenta que, sob determinadas condições, adquire um movimento de rotação em torno de uma
	 * região de baixa pressão atmosférica. Um ciclone pode atingir um diâmetro de até 500 km. Furacões são os mais violentos desses ciclones e 
	 * chegam a produzir ventos de até 320 km/h. Na tabela abaixo, são apresentados alguns dados relativos à classificação dos furacões segundo a
	 * escala Saffir-Simpson:
	 * 
	 * classificação			velocidade dos ventos (km/h)
	 * tempestade tropical		62 a 118
	 * furacão de categoria 1	119 a 153
	 * furacão de categoria 2	154 a 177
	 * furacão de categoria 3	178 a 209
	 * furacão de categoria 4	210 a 249
	 * furacão de categoria 5	maior que 249
	 * 
	 * Escreva um programa que leia a velocidade (somente a parte inteira) do vento aferida durante uma tempestade e apresente ao usuário a 
	 * classificação.
	 */
	public void verificarTipoDeTempestade() {
		int v = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do vento durante a tempestade (somente a parte inteira): "));
		
		if (v >= 62 && v <= 118) {
			System.out.println("tempestade tropical");
		} else if (v >= 119 && v <= 153) {
			System.out.println("furac\u00e3o de categoria 1");
		} else if (v >= 154 && v <= 177) {
			System.out.println("furac\u00e3o de categoria 2");
		} else if (v >= 178 && v <= 209) {
			System.out.println("furac\u00e3o de categoria 3");
		} else if (v >= 210 && v <= 249) {
			System.out.println("furac\u00e3o de categoria 4");
		} else if (v >= 250) {
			System.out.println("furac\u00e3o de categoria 5");
		}
	}
}