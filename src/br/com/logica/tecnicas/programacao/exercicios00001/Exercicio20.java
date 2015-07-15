package br.com.logica.tecnicas.programacao.exercicios00001;

import br.com.logica.tecnicas.programacao.extras.Caracteres;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.verificarCaracteresDaFrase("Alberto Cerqueira", 25);
	}

	/**
	 * Crie um programa que contenha um vetor de caracteres de 300 posições e o inicialize com a frase: "Meu nome eh <escreva seu nome aqui> e tenho
	 * <sua idade aqui> anos." Mostre quantos espaços tem a frase, quantos caracteres, quantas letras maiúsculas e quantas são minúsculas, quantos 
	 * dígitos tem e quantos foram os caracteres de pontuação.
	 * DICA: Apenas no momento da criação de um vetor de caracteres é que você poderá armazenar uma frase diretamente.
	 * Por exemplo:
	 * char frase[256] = "Meu nome eh: Matusalem e tenho 931 anos.";
	 */
	public void verificarCaracteresDaFrase(String nome, int idade) {
		String f = "Meu nome e " + nome + " e tenho " + idade + " anos.";
		char[] letras = new char[300];
		int espacos = 0, maiusculas = 0, minusculas = 0;
		for (int i = 0, s = f.length(); i < s; i++) {
			char letra = f.charAt(i);
			letras[i] = f.charAt(i);
			
			if (letra == ' ') {
				espacos++;
			}
			
			if (Caracteres.isLowerCase(letra)) {// Apenas encapsulando a verificação de letras minúsculas.
				minusculas++;
			}
			
			if (Caracteres.isUpperCase(letra)) {// Apenas encapsulando a verificação de letras maiúsculas.
				maiusculas++;
			}
	    }
		
		System.out.println("Frase: " + f);
		System.out.println("Est\u00e1 frase possui " + minusculas + " letras min\u00fasculas.");
		System.out.println("Est\u00e1 frase possui " + maiusculas + " letras mai\u00fasculas.");
		System.out.println("Est\u00e1 frase possui " + f.length() + " caracteres.");
		System.out.println("Est\u00e1 frase possui " + espacos + " espa\u00e7os em branco.");
	}
}