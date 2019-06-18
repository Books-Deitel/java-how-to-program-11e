/*
 * Objetivo: 6.18 (Exibindo um quadrado de asteriscos) Escreva um m�todo squareOfAsterisks
 * que exibe um quadrado s�lido (o mesmo n�mero de linhas e colunas) de asteriscos cujo lado
 * � especificado no par�metro inteiro side. Por exemplo, se side for 4, o m�todo dever� exibir
 * 
 *   ****
 *   ****
 *	 ****
 *	 ****
 * Incorpore esse m�todo a um aplicativo que l� um valor inteiro para side a partir da entrada
 * fornecida pelo usu�rio e gera sa�da dos asteriscos com o m�todo squareOfAsterisks.
 * 
 * Autor: Gustavo Alves
 */

package ch06.ex06_18;

import java.util.Scanner;

public class SquareOfAsterisks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the side of square: ");
		squareOfAsterisks(scanner.nextInt());

		scanner.close();
	}

	public static void squareOfAsterisks(int side) {
		String result = "";

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++)
				result += "*";

			result += "\n";
		}

		System.out.println(result);
	}
}
