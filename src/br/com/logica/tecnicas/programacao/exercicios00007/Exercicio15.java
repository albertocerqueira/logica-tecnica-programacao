package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/10
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe15 = new Exercicio15();
		exe15.somandoNumeros();
	}
	
	/**
	 * Receba dois números pelo teclado, some os dois. Se o resultado for maior que 10 mostre a soma no vídeo.
	 */
	public void somandoNumeros() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro: "));
		
		int s = n1 + n2;
		if (s > 10) {
			System.out.println(n1 + " + " + n2 + " = " + s);
		}
	}
}