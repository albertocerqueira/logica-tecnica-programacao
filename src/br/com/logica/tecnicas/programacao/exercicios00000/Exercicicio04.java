package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/22
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.pesquisaSalarialProfessores();
	}
	
	/**
	 * Escreva um programa que leia o nome completo de uma pessoa (na forma nome e sobrenome) depois crie um email que obedeça as seguintes regras:
	 * -Ligar nome e sobrenome com um '.' (caractere ponto);
	 * -No nome criado acrescentar o caractere '@';
	 * -Acrescentar o nome da empresa, em nosso caso "ltp.edu.br"
	 * Exemplo: Silvia Brunini se transformará em silvia.brunini@ltp.edu.br
	 */
	public void pesquisaSalarialProfessores() {
		String email = JOptionPane.showInputDialog("Digite seu nome completo (na forma nome e sobrenome):");
		email = email.toLowerCase().replace(" ", ".") + "@albertocerqueira.com.br";
		System.out.println(email);
	}
}