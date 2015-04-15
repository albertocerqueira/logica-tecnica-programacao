package br.com.logica.tecnicas.programacao.exercicios00002;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.multiplosDe3();
	}
	
	/**
	 * Apresenta todos os multiplos de 3 entre os números 1 e 20.
	 */
	public void multiplosDe3() {
		for (int x = 1; x < 20; x++) {
			if (x % 3 == 0) {
				System.out.println("N\u00famero m\u00faltiplo de 3: " + x);
			}
		}
	}
}