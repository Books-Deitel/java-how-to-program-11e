/*
 * Objetivo: 6.26 (Invertendo d�gitos) Escreva um m�todo que recebe um valor inteiro e retorna
 * o n�mero com seus d�gitos invertidos. Por exemplo, dado o n�mero 7.631, o m�todo deve retornar
 * 1.367. Incorpore o m�todo a um aplicativo que l� um valor a partir da entrada fornecida pelo
 * usu�rio e exibe o resultado.
 * 
 * Autor: Gustavo Alves
 */

package ch06.ex06_26;

import java.util.Scanner;

public class ReversingDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		input.close();

		System.out.println(reverse(value));
	}

	public static int reverse(int value) {
		int reverted = 0;

		while (value != 0) {
			int rem = value % 10;
			value /= 10;
			reverted = rem + 10 * reverted;
		}

		return reverted;
	}
}
