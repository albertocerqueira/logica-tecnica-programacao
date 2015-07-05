package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicicio20 {

	public static void main(String[] args) {
		Exercicicio20 exe20 = new Exercicicio20();
		exe20.verificarSexoEIdade();
	}
	
	/**
	 * Fazer um programa capaz de ler um caractere (‘F’ ou ‘M’) que representa o sexo de uma pessoa.
	 * • Caso o usuário tenha digitado ‘F’, seu programa deverá ler a idade e mostrar uma das mensagens abaixo:
	 * • “Seu chefe te liberou para ir ao SHOPPING” para idades menores que 30;
	 * • “Seu chefe te liberou para a BALADA” para maiores de 31 anos.
	 * • No caso da escolha ser ‘M’ as mensagens serão:
	 * • “Seu chefe te liberou para o FUTEBOL” para idades menores que 40;
	 * • “Seu chefe te liberou para a BALADA” para maiores de 41 anos.
	 * No caso da ENTRADA para sexo ser diferente das descritas acima, seu programa deverá mostrar a mensagem: “SEXO INDEFINIDO”.
	 */
	public void verificarSexoEIdade() {
		String s = JOptionPane.showInputDialog("Digite o sexo da pessoa: ");
		Integer i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade pessoa: "));
		if (s.equalsIgnoreCase("f")) {
			if (i < 30) {
				System.out.println("Seu chefe te liberou para ir ao SHOPPING");
			} else {
				System.out.println("Seu chefe te liberou para a BALADA");
			}
		} else if (s.equalsIgnoreCase("m")) {
			if (i < 40) {
				System.out.println("Seu chefe te liberou para o FUTEBOL");
			} else {
				System.out.println("Seu chefe te liberou para o BALADA");
			}
		} else {
			System.out.println("SEXO INDEFINIDO");
		}
	}
}