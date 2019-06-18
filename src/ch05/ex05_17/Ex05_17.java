/*
 * Objetivo: 5.16 (Gr�fico de barras do programa de impress�o) Uma aplica��o interessante dos computadores � exibir diagramas e 
 * gr�ficos de barras. Escreva um aplicativo que leia cinco n�meros entre 1 e 30. Para cada n�mero que � lido, seu programa deve
 * exibir o mesmo n�mero de asteriscos adjacentes. Por exemplo, se seu programa l� o n�mero 7, ele deve exibir *******. Exiba as
 * barras dos asteriscos depois de ler os cinco n�meros.
 * 
 * Autor: Gustavo Alves
 */

package ch05.ex05_17;

import java.util.Scanner;

public class Ex05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];
		String[] bars = new String[5];

		for (int i = 0; i < bars.length; i++)
			bars[i] = "";

		for (int i = 0; i < numbers.length;) {
			System.out.print("Enter a number between 1 and 30: ");
			numbers[i] = input.nextInt();

			if (numbers[i] < 1 || numbers[i] > 30) {
				System.out.println(" - Error: number must is between 1-30. Try again!");
			} else {
				for (int j = 0; j < numbers[i]; j++)
					bars[i] += "*";

				i++;
			}
		}

		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%02d = %s%n", numbers[i], bars[i]);

		input.close();
	}
}
