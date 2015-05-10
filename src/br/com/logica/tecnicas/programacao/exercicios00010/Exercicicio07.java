package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.arredondar();
	}

	/**
	 * Escreva um programa capaz de ler um número real x e um valor inteiro n entre 0 e 3. Este programa deverá passar os valores lidos para a função
	 * arredonda(). A função arredonda() deverá ser capaz de retornar o número lido com o número de casas pedidos. O programa principal deverá 
	 * imprimir o valor retornado.
	 * 
	 * Dica: Um algoritmo de programação para arredondar um número real para n casas decimais é:
	 * Passo 1: Multiplique o número por 10ⁿ.
	 * Passo 2: Adicione 0.5
	 * Passo 3: Apague a parte fracionada do resultado.
	 * Passo 4: Divida por 10ⁿ.
	 * 
	 * Por exemplo, usando este algoritmo para arredondar o número 78,374625 para 3 casas decimais.
	 * Passo 1: 78.374625 X 10³ = 78374.625
	 * Passo 2: 78374.625 + 0.5 = 78375.125
	 * Passo 3: Conservando a parte inteira = 78375
	 * Passo 4: 78375 dividido por 10³ = 78.375
	 * 
	 * Outros exemplos: 
	 * x = 4.9 e n = 0 implica que arredondando teremos 5.
	 * x = 4.92 e n = 1 implica que arredondando teremos 4.9.
	 * x= 4.978 e n =2 implica que arredondando teremos 4.98.
	 */
	public void arredondar() {
		double n = arredondarNumeroReal(78.374625, 3);
		System.out.println(n);
	}
	
	public double arredondarNumeroReal(double r, int e) {
		double numero = 0, valorFinal , soma;
		double f = 0;
		numero = elevado(10, e);
		valorFinal = r * numero;
		soma = valorFinal + 0.5;
		f = ((int) soma) / numero;
		return f;
	}
	
	/*
	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		System.out.println(10*10*10);
		System.out.println(exe07.elevado(10, 3));
		System.out.println(6*6*6*6);
		System.out.println(exe07.elevado(6, 4));
	}
	*/
	
	public int elevado(int n, int expoente) { //TODO: usar no projeto...
		int r = n;
		for (int x = 0; x < (expoente - 1) ; x++) {
			r = r * n;
		}
		return r;
	}
}