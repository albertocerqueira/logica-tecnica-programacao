package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.calcularTempoParaProducaoDaPeca();
	}
	
	/**
	 * Um sistema de máquinas demora 37 segundos para produzir uma peça. Sua tarefa é fazer um programa que leia a quantidade de peças a ser 
	 * produzida e calcule o tempo em horas, minutos e segundos necessário para produzir essa quantidade de peças.  
	 * 
	 * Exemplo:
	 * Se digitado pelo usuário o número 250, deverá aparecer na tela 2 horas, 34 minutos e 10 segundos. 
	 */
	public void calcularTempoParaProducaoDaPeca() {
		int q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pe\u00e7as: "));
		long seg = q * 37;
		long r_seg = seg % 60;
		long min = seg / 60;
		long r_min = min % 60;
		long hr = min / 60;
		
		System.out.println(hr + (hr == 1 ? " hora" : " horas") + ", " + r_min + (r_min == 1 ? " minuto " : " minutos") + " e " + r_seg + (r_seg == 1 ? " segundo." : " segundos."));
	}
}