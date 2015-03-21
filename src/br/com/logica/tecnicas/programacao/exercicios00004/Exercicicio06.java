package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.verificarRaizQuadradaDezenas();
	}

	/**
	 * Qualquer numero natural de quatro algarismos pode ser dividido em duas dezenas
	 * formadas pelos seus dois primeiros e dois ultimos dígitos.
	 * Exemplos:
	 * 1297: 12 e 97.
	 * 5314: 53 e 14.
	 * Escreva um programa que imprime todos os milhares (4 algarismos)
	 * cuja raiz quadrada seja a soma das dezenas formadas pela divisao acima.
	 * Exemplo: raiz de 9801 = 99 = 98 + 01.
	 * Portanto 9801 e um dos numeros a ser impresso.
	 */
	public void verificarRaizQuadradaDezenas() {
		for (int x = 1000; x <= 9999; x++) {
			int d1 = x / 100;
			int d2 = x % 100;
			int raiz = (d1 + d2);

			if ((raiz * raiz) == x) {
				System.out.println(x + " = " + raiz + "² = " + d1 + " + " + d2);
			}
		}
	}
}
