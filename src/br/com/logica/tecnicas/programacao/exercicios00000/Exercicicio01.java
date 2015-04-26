package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/09
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.pesquisaSalarialProfessores();
	}
	
	/**
	 * Uma agremiação de professores resolveu fazer uma pesquisa para saber qual é o salário e a quantidade de instituições educacionais em que seus 
	 * sócios trabalham. Sua tarefa é escrever um programa que contenha uma função. Esta função deve ler as seguintes informações para um número 
	 * indeterminado de professores: um número inteiro positivo (representando o número de matrícula do professor), o número de lugares que o 
	 * professor ministra e, para cada lugar em que o professor trabalha, devem ser lidas: o número de aulas semanais que o professor tem no local, o
	 * valor pago por hora/aula e a quantidade de semanas a serem consideradas. A função também deve calcular e imprimir na tela:
	 * a.	Quanto cada professor ganha em cada local em que ministra suas aulas (multiplicar o valor pago por hora/aula pelo número de aulas pela 
	 * quantidade de semanas),
	 * b.	Calcular o valor total que cada professor recebe,
	 * c.	A média aritmética da quantidade de locais em que os professores ministram aulas,
	 * d.	O maior valor total recebido por um professor entre todos os outros professores pesquisados e o número de matrícula desse professor.
	 * A leitura dos dados em sua função para quando for digitado um número negativo para o número de matrícula do professor.
	 */
	public void pesquisaSalarialProfessores() {
		int matricula = 0, maiorValorMatricula = 0, i = 0, quantidadeLocais = 0;;
		double maiorValor = 0;
		do {
			matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matr\u00edcula do " + (i + 1) + "° professor:"));
			if (matricula >= 0) {
				int quantidadeAulasLocais = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de lugares que o " + (i + 1) + "° professor ministra:"));
				double[] ganhoProfessor = new double[quantidadeAulasLocais];
				double valorTotal = 0;
				for (int y = 0; y < quantidadeAulasLocais; y++) {
					int quantidadeAulaLocal = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aulas semanais que o professor ministra no " + (y + 1) + "° local:"));
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora da aula que o professor ministra no " + (y + 1) + "° local:"));
					int quantidadeSemanas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semanas que o professor vai ministrar no " + (y + 1) + "° local:"));
					double valorCalculado = valor * (quantidadeAulaLocal * quantidadeSemanas);
					ganhoProfessor[y] = valorCalculado;
					if (valorCalculado > maiorValor) {
						maiorValor = valorCalculado;
						maiorValorMatricula = matricula;
					}
					
					System.out.println("O professor com matr\u00edcula " + matricula + " fatura " + valorCalculado + " no " + (y + 1) + "° local.");
					valorTotal += valorCalculado;
				}
				System.out.println("O professor com matr\u00edcula " + matricula + " fatura " + valorTotal + " ao todo.");
				quantidadeLocais += quantidadeAulasLocais;
				i++;
			}
		} while (matricula >= 0);
		System.out.println("O maior valor ganho por um professor \u00e9 " + maiorValor + " o qual possui matr\u00edcula: " + maiorValorMatricula);
		System.out.println("A m\u00e9dia de locais que os professores ministram aulas \u00e9: " + (quantidadeLocais / i));
	}
}