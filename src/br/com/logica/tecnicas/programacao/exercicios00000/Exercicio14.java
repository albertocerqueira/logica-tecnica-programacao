package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Exercicio14 exe14 = new Exercicio14();
		exe14.converterTemperatura(1, 150);
		exe14.converterTemperatura(2, 150);
	}

	/**
	 * Escreva uma aplicação que converta uma temperatura expressa em graus Celsius em seu valor equivalente em graus Fahrenheit (C = 5/9*(F-32)) ou 
	 * vice-versa de acordo com a opção de conversão escolhida pelo usuário.
	 */
	public void converterTemperatura(int m, double t) {
		if (m == 1) {
			double a = converterTemperaturaParaCelsius(t);
			System.out.println(a);
		} else if (m == 2) {
			double a = converterTemperaturaParaFahrenheit(t);
			System.out.println(a);
		}
	}
	
	public double converterTemperaturaParaCelsius(double t) {
		return (t - 32) / 1.8;
	}

	public double converterTemperaturaParaFahrenheit(double t) {
		return t * 1.8 + 32;
	}
}