package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/05/30
 */
public class Exercicicio19 {

	public static void main(String[] args) {
		Exercicicio19 exe19 = new Exercicicio19();
		exe19.acharMaiorMenorTemperatura(new int[]{8, 20, 30, 50, 40, 20, -10}, 4);
		System.out.println();
		exe19.acharMaiorMenorTemperatura(new int[]{-5, -12, 0, 6}, 2);
		System.out.println();
		exe19.acharMaiorMenorTemperatura(new int[]{35, -35, 5, 100, 100, 50, 50}, 4);
	}

	/**
	 * O planeta NetByte fica ao redor do Sol, porém não possui as proteções da atmosfera que existem na Terra, ficando exposto ao ataque do Sol por 
	 * constantes explosões. Além das explosões solares, o NetByte tem uma variação de temperatura brutal, passando de cerca de 130 graus positivos 
	 * durante o dia a 129 graus negativos à noite.
	 * A NASA decidiu enviar uma sonda ao planeta NetByte para estudar com mais precisão as variações de temperatura em sua superfície. Essa sonda 
	 * possui um sensor que mede a temperatura de 1 em 1 minuto. Um dado importante que os pesquisadores desejam descobrir é como se comporta a média
	 * da temperatura, considerada em intervalos de uma dada duração (uma hora, meia hora, oito horas, etc.). 
	 * Por exemplo, para a seqüência de medições 8, 20, 30, 50, 40, 20, -10, e intervalos de quatro minutos, as médias são respectivamente 
	 * 108/4=27, 140/4=35, 140/4=35 e 100/4=25.
	 * 
	 * Você foi recentemente contratado pela NASA, e sua primeira tarefa é escrever um programa que, conhecidos a seqüência de temperaturas medidas 
	 * pelo sensor, e o tamanho do intervalo desejado, maior e qual a menor temperatura média observadas, considerando o tamanho do intervalo dado.
	 * 
	 * A entrada é composta de vários conjuntos de teste. A primeira linha de um conjunto de teste contém dois números inteiros positivos N e M, que
	 * indicam respectivamente o número total de medições de temperatura de uma seqüência obtida pelo sensor, e o tamanho dos intervalos, em minutos,
	 * em que as médias devem ser calculadas. As N linhas seguintes contêm um número inteiro cada, representando a seqüência de medidas do sensor. 
	 * O final da entrada é indicado quando N = M = 0. Tanto a entrada quanto a saída devem conter frases de solicitação e de apresentação de 
	 * resultados ao usuário.
	 */
	private void acharMaiorMenorTemperatura(int[] array, int intervalo) {
		int t = array.length;
		double maior = 0, menor = 0;
		for (int x = 0, y = t; x < y; x++) {
			if ((x + intervalo) > t) {
				break;
			} else {
				int soma = 0;
				for (int i = 0; i < intervalo; i++) {
					soma += array[x+i];
					if (i == (intervalo - 1)) {
						System.out.print(array[x+i]);
					} else {
						System.out.print(array[x+i] + " + ");
					}
				}
				double media = soma / intervalo;
				System.out.print(" = " + soma + " / " + intervalo + " = " + media);
				if (x == 0) {
					maior = media;
					menor = media;
				}
				if (media > maior) {
					maior = media;
				}
				if (media < menor) {
					menor = media;
				}
				System.out.println();
			}
		}
		System.out.println("A maior m\u00e9dia \u00e9: " + maior);
		System.out.println("A menor m\u00e9dia \u00e9: " + menor);
	}
}