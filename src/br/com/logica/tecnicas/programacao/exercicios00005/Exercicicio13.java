package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/02
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.pesquisaDeFaculdade();
	}
	
	/**
	 * Os professores de uma faculdade da área de exatas desejam fazer uma festa no feriado. Foi solicitado aos docentes que informassem os seguintes
	 * dados:
	 * - A escolha do lugar entre as opções ‘p’ (praia) ou ‘h’ (hotel fazenda);
	 * - A escolha do tipo de comida entre as opções ‘c’ (churrasco) ou ‘f’ (feijoada) ou ‘m’ (massa);
	 * - A escolha do dia preferido entre as opções ‘s’ (sábado) ou ‘d’ (domingo).
	 * Sua tarefa é fazer um programa que leia as opções de uma quantidade indeterminada de professores que votaram e imprimir na tela as opções
	 * campeãs (lugar, tipo de comida e dia preferido). O programa deve perguntar se deseja continuar a cada ciclo de repetição.
	 */
	public void pesquisaDeFaculdade() {
		String c = "S";
		int p = 0, h = 0, o = 0, f = 0, m = 0, s = 0, g = 0;
		while (c.equalsIgnoreCase("S")) {
			String l = JOptionPane.showInputDialog("Voc\u00ea deseja:\nP - praia\nH - hotel");
			String t = JOptionPane.showInputDialog("Voc\u00ea deseja:\nC - churrasco\nF - feijoada\nM - massa");
			String d = JOptionPane.showInputDialog("Voc\u00ea deseja:\nS - s\u00e1bado\nD - domingo");
			
			if (l.equalsIgnoreCase("P")) {
				p++;
			} else if (l.equalsIgnoreCase("H")) {
				h++;
			}
			
			if (t.equalsIgnoreCase("C")) {
				o++;
			} else if (t.equalsIgnoreCase("F")) {
				f++;
			} else if (t.equalsIgnoreCase("M")) {
				m++;
			}
			
			if (d.equalsIgnoreCase("S")) {
				s++;
			} else if (d.equalsIgnoreCase("D")) {
				g++;
			}
			
			c = JOptionPane.showInputDialog("Deseja continuar?\nS - sim\nN - n\u00e3o");
		}
		
		if (p > h) {
			System.out.println("Local mais votado: praia");
		} else if (p < h) {
			System.out.println("Local mais votado: hotel");
		} else {
			System.out.println("Local mais votado: empate entre praia e hotel");
		}
		
		if (o > f && o > m) {
			System.out.println("Comida mais votado: churrasco");
		} else if (m > f && m > o) {
			System.out.println("Comida mais votado: massa");
		} else if (f > o && f > m) {
			System.out.println("Comida mais votado: feijoada");
		} else {
			System.out.println("Comida mais votado: empate entre churrasco, feijoada e massa");
		}
		
		if (s > g) {
			System.out.println("Dia mais votado: s\u00e1bado");
		} else if (g < s) {
			System.out.println("Dia mais votado: domingo");
		} else {
			System.out.println("Dia mais votado: empate entre s\u00e1bado e domingo");
		}
	}
}