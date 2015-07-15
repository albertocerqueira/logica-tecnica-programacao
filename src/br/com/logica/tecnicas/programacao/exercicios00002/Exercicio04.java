package br.com.logica.tecnicas.programacao.exercicios00002;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Exercicio04 exe04 = new Exercicio04();
		exe04.verificarData(2313);
	}
	
	/**
	 * Escreva um programa que contenha uma função. Esta função deve receber um número por parâmetro (representando uma data no formato ddmm),
	 * verificar se a data e valida ou não. Caso a data seja válida retornar 1, caso contrário retornar 0 se o mês for inválido ou retornar –1 caso 
	 * o dia seja inválido. A função main() deve imprimir o valor de retorno. Para facilitar a consulta, essa função deve fazer uso de um vetor 
	 * pré-definido com o número de dias de cada mês. Como exemplo de vetor: int total_dias={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}.
	 */
	public void verificarData(Integer data) {
		Integer retorno = getValor(data);
		System.out.println("Valor de retorno: " + retorno);
	}
	
	public Integer getValor(Integer data) {
		int valor = 0;
		int[] total_dias = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int mes = data % 100;
		int dia = data / 100;
		for (int x = 0; x < 12; x++) {
			if (mes < 1 || mes > 12) {
				valor = 0;
	        } else if (dia < 0 || dia > total_dias[x]) {
				valor = -1;
			} else {
	            valor = 1;
	        }
		}
		return valor;
	}
}