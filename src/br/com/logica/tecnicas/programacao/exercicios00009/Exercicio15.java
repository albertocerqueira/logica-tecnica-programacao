package br.com.logica.tecnicas.programacao.exercicios00009;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/18
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe15 = new Exercicio15();
		exe15.somaNumerosNaturais();
	}
	
	/**
	 * Apresentar o total da soma obtida dos cem primeiros números naturais (1, 2, 3, 4, 5, ...100).
	 */
	public void somaNumerosNaturais() {
		int n = 0, s = 0;
		
		while (n <= 100) {
			s += n++;
		}
		
		System.out.println("1 + 2 + 3 + ... + 100 = " + s);
	}
}