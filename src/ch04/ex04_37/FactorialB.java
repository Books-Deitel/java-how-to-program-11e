/*
 * Objetivo: b) Escreva um aplicativo que estima o valor da constante matem�tica (e) utilizando a f�rmula a seguir. 
 * Permita ao usu�rio inserir o n�mero de termos a calcular.
 *		 e  = 1 + (1 / 1!) + (1 / 2!) + (1 / 3!) + ...
 * 
 * Autor: Gustavo Alves
 */

package ch04.ex04_37;

import java.util.Scanner;

public class FactorialB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfTerms;

		System.out.print("Enter number of terms: ");
		numberOfTerms = scanner.nextInt();
		scanner.close();

		double result = 1;
		int counter = 1;

		while (counter <= numberOfTerms) {

			int auxCounter = counter;
			double factorial = 1;
			while (auxCounter > 0) {
				factorial *= auxCounter;
				auxCounter--;
			}

			result += 1 / factorial;
			counter++;
		}

		System.out.printf("e = %f", result);
	}
}
