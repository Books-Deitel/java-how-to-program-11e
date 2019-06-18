/*
 * Objetivo: 6.21 (Separando d�gitos) Escreva m�todos que realizam cada uma das seguintes tarefas:

 * 	a) Calcule a parte inteiro do quociente quando o inteiro a � dividido pelo inteiro b.
 * 	b) Calcule o resto inteiro quando o inteiro a � dividido por inteiro b.
 * 	c) Utilize m�todos desenvolvidos nas partes (a) e (b) para escrever um m�todo displayDigits
 *     que recebe um inteiro entre 1 e 99999 e o exibe como uma sequ�ncia de d�gitos, separando
 *     cada par de d�gitos por dois espa�os. Por exemplo, o inteiro 4562 deve aparecer como 
 *     4  5  6  2
 * 		
 * Incorpore os m�todos em um aplicativo que insere um n�mero inteiro e chama displayDigits 
 * passando para o m�todo o n�mero inteiro inserido. Exiba os resultados.
 * 
 * Autor: Gustavo Alves
 */

package ch06.ex06_21;

import java.util.Scanner;

public class SeparatingDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		do {
			System.out.print("Enter a number between 1 and 99999: ");
			number = input.nextInt();
		} while (number < 1 || number > 99999);
		input.close();

		displayDigits(number);
	}

	public static int quotient(int a, int b) {
		return a / b;
	}

	public static int rem(int a, int b) {
		return a % b;
	}

	public static void displayDigits(int number) {
		String result = "";

		while (number != 0) {
			int rem = rem(number, 10);
			number = quotient(number, 10);
			result = rem + "  " + result;
		}

		System.out.println(result);
	}
}
