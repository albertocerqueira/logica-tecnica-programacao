package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.trianguloRetangulo(4, 3, 5);
	}
	
	/**
	 * Dados três números naturais, verificar se eles formam os lados de um triângulo retângulo.   
	 */
	public void trianguloRetangulo(int ladoA, int ladoB, int ladoC) {
		int auxilio;
		if (ladoA < ladoB) {
			auxilio = ladoA;
			ladoA = ladoB;
			ladoB=auxilio;
		}
		if (ladoA < ladoC) {
			auxilio = ladoA;
			ladoA = ladoC;
			ladoC = auxilio;
		}
		if (ladoA * ladoA == (ladoB * ladoB) + (ladoC * ladoC)) {
			System.out.println("Este \u00e9 um Triangulo Ret\u00e2ngulo!");
		} else {
			System.out.println("Este n\u00e3o \u00e9 um Tri\u00e2ngulo Retangulo!");
		}
	}
}