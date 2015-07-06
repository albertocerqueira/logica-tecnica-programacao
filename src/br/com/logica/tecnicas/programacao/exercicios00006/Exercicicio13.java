package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.converterTemperatura();
	}
	
	/**
	 * Faça um programa que realize conversões de temperaturas em graus Celsius, Fahrenheit ou Kelvin. O programa deve ler da entrada a temperatura e 
	 * uma das seguintes opções:
	 * 
	 * A. de Celsius para Fahrenheit
	 * B. de Fahrenheit para Celsius
	 * C. de Celsius para Kelvin
	 * D. de Kelvin para Celsius
	 * E. de Kelvin para Fahrenheit
	 * F. de Fahrenheit para Kelvin
	 * 
	 * Utilize o comando switch. Lembre-se que:
	 * 
	 * Conversões:
	 * De			Para		Fórmula
	 * Celsius		Fahrenheit	°F = °C * 1.8 + 32
	 * Fahrenheit	Celsius		°C = (°F - 32) * (5 / 9)
	 * Celsius		Kelvin		°K = °C + 273.15
	 * Kelvin		Celsius		°C = °K - 273.15
	 * Kelvin		Fahrenheit	°F = °K * 1.8 + 459.67
	 * Fahrenheit	Kelvin		°K = (°F + 459.67) / 1.8
	 */
	public void converterTemperatura() {
		String c = JOptionPane.showInputDialog("Digite a op\u00e7\u00e3o para convers\u00e3o:\nA. de Celsius para Fahrenheit\nB. de Fahrenheit para Celsius\nC. de Celsius para Kelvin\nD. de Kelvin para Celsius\nE. de Kelvin para Fahrenheit\nF. de Fahrenheit para Kelvin");
		Double t = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura para convers\u00e3o: "));
		
		switch (c) {
			case "A":
				System.out.println(t * 1.8 + 32);
				break;
			case "B":
				System.out.println((t - 32) * (5 / 9));
				break;
			case "C":
				System.out.println(t + 273.15);
				break;
			case "D":
				System.out.println(t - 273.15);
				break;
			case "E":
				System.out.println(t * 1.8 + 459.67);
				break;
			case "F":
				System.out.println((t + 459.67) / 1.8);
				break;
			default:
				System.out.println("Op\u00e7\u00e3o inv\u00e1lida!");
		}
	}
}