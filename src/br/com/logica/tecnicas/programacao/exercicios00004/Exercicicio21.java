package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/28
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.verificarRegulagemMotor();
	}

	/**
	 * Escreva um programa capaz de ler a quantidade de Km percorridos, a quantidade em litros de combustível consumido e um caracte que representa o
	 * combustível: álcool (A) ou gasolina (G). No final o programa deverá mostrar o consumo em km/l e uma mensagem informando se o motorista precisa
	 * regular o motor. OBS. Caso o combustível seja gasolina e o consumo seja inferior a 8 km/l, é recomendável a regulagem. No caso do álcool este 
	 * consumo deve ser inferior a 5 km/l.
	 */
	public void verificarRegulagemMotor() {
		double km = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de km percorridos: "));
		double l = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros consumidos no percurso: "));
		String c = JOptionPane.showInputDialog("Digite o tipo de combust\u00edvel:\n(A) \u00e1lcool\n(G) gasolina ");
		
		double consumo = km / l;
		if (c.equalsIgnoreCase("a") && consumo > 5) {
			System.out.println("\u00c9 necess\u00e1rio fazer a regulagem do motor.");
		} else if (c.equalsIgnoreCase("g") && consumo > 8) {
			System.out.println("\u00c9 necess\u00e1rio fazer a regulagem do motor.");
		}
	}
}