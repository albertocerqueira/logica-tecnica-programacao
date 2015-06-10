package br.com.logica.tecnicas.programacao.exercicios00001;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicicio18 {

	public static void main(String[] args) {
		Exercicicio18 exe18 = new Exercicicio18();
		exe18.criarArrayCubo();
	}

	/**
	 * Fazer um programa capaz de preencher um vetor A de 20 posições com números aleatórios entre 1 e 80. Depois construir um outro vetor, B, com
	 * o resultado do cubo dos elementos do vetor A. Mostrar ambos os vetores. 
	 * Desafio: Você seria capaz de mostrar no formato de tabela? Exemplo:
	 * Número	Cubo
	 * 2		8
	 * 5		125
	 * 1		1
	 * ... 		...
	 */
	public void criarArrayCubo() {
		int q = 20;
		int[] a = RandomUtils.gerarNumerosAleatorios(q, 1, 80);// Apenas encapsulando a criação de números aleatórios.
		
		int[] b = new int[q];
		for (int x = 0; x <= q; x++) {
			int n = a[x];
			b[x] = n * n * n;
		}
		
		System.out.println("N\u00fameros\tCubo");
		for (int x = 0; x < q; x++) {
			System.out.println(a[x] + "\t" + b[x]);
		}
	}
}