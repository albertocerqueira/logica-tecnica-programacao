package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/18
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.pesquisar();
	}

	/**
	 * Escreva um programa na linguagem C que leia um número indeterminado de informações de uma comunidade: idade e estado civil (C quando casado, S
	 * quando solteiro, V quando viúvo e D quando divorciado ou separado) . O programa deve:
	 * • Imprimir a quantidade de pessoas que participaram da pesquisa;
	 * • A média das idades das pessoas viúvas;
	 * • A porcentagem de pessoas divorciadas ou separadas que participaram da pesquisa.
	 * Obs: O programa deve continuar repetindo o procedimento enquanto não for digitado a letra ‘F’.
	 */
	public void pesquisar() {
		String l = "a";
		
		int q = 0, sv = 0, sds = 0;
		while (!l.equalsIgnoreCase("F")) {
			l = JOptionPane.showInputDialog("Digite o estado civil da pessoa: ");
			if (!l.equalsIgnoreCase("F")) {
				int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
				q++;
				
				if (l.equalsIgnoreCase("V")) {
					sv += i;
				}
				
				if (l.equalsIgnoreCase("D")) {
					sds++;
				}
			}
		}
		
		if (q != 0) {
			System.out.println("Foram entrevistadas " + q + " pessoas.");
			System.out.println("A m\u00e9dia de idade das pessoas v\u00eduvas \u00e9: " + (sv / q));
			System.out.println("A porcentagem de pessoas divorciadas ou separadas \u00e9: " + ((sds * 100) / q));
		}
	}
}