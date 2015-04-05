package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.verificarTemperaturas(new int[]{10, 15, 16, 20, 18});
	}
	
	/**
	 * Dadas as temperaturas dos últimos 5 dias em uma cidade, escrever um programa que calcule e exiba a temperatura mais alta registrada e a
	 * temperatura mais baixa registrada.
	 */
	public void verificarTemperaturas(int[] temperaturas) {
		float maior, menor;
		maior = temperaturas[0];
		menor = temperaturas[0];
		for (int i = 0; i < 5; i++)	{
			if(temperaturas[i] > maior) {				
				maior = temperaturas[i];
			}
			if(temperaturas[i] < menor) {				
				menor = temperaturas[i];
			}
		}
		System.out.println("A maior temperatura foi: " + maior);
		System.out.println("A menor temperatura foi: " + menor);
	}
}