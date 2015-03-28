package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.verificandoNumerosCongruentes();
	}
	
	/**
	 *   Dizemos que um número i é congruente módulo m a j se i % m = j % m. 
	 *   Exemplo: 35 é congruente módulo 4 a 39, pois
	 *   35 % 4 = 3 = 39 % 4.
	 *   Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j módulo m.
	 */
	public void verificandoNumerosCongruentes() {
		System.out.println("Verificando n\u00fameros congruentes do m\u00f3dulo m a j:");
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00famero congruentes:"));
		Integer j = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero j:"));
		Integer m = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero m:"));
		System.out.println("(i % " + m + " = " + j + " % " + m + ")");
		System.out.println("Os " + n + " primeiros naturais congruentes a " + j + " modulo " + m + " s\u00e3o: ");
		for (int i = 0; n != 0; i++) { 
			if (i % m == j % m) {
				System.out.println(i);
				n = n - 1;
		    }
		}
	}
}