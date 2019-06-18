/*
 * Objetivo: 2.15 (Aritm�tica) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros, obtenha dele esses
 * n�meros e imprima sua soma, produto, diferen�a e quociente (divis�o). Utilize as t�cnicas mostradas na Figura 2.7.
 * 
 * Autor: Gustavo Alves
 */

package ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum, sub, div, mul;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		input.close();

		sum = number1 + number2;
		mul = number1 * number2;
		sub = number1 - number2;
		div = number1 / number2;

		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", mul);
		System.out.printf("Difference is %d%n", sub);
		System.out.printf("Quotient is %d%n", div);
	}
}
