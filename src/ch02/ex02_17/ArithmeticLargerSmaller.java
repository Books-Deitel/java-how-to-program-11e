/*
 * Objetivo: 2.17 (Aritm�tica, menor e maior) Escreva um aplicativo que insira tr�s inteiros digitados pelo usu�rio e
 * exiba a soma, m�dia, produto e os n�meros menores e maiores. Utilize as t�cnicas mostradas na Figura 2.15. [Observa��o: 
 * o c�lculo da m�dia neste exerc�cio deve resultar em uma representa��o de inteiro. Assim, se a soma dos valores for 7, a 
 * m�dia dever� ser 2, n�o 2,3333...]
 * 
 * Autor: Gustavo Alves
 */

package ch02.ex02_17;

import java.util.Scanner;

public class ArithmeticLargerSmaller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1, number2, number3;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		input.close();

		int sum = number1 + number2 + number3;
		int average = sum / 3;
		int product = number1 * number2 * number3;

		int larger = number1;
		if (number2 > larger)
			larger = number2;
		if (number3 > larger)
			larger = number3;

		int smaller = number1;
		if (number2 < smaller)
			smaller = number2;
		if (number3 < smaller)
			smaller = number3;

		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Media is %d%n", average);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Larger is %d%n", larger);
		System.out.printf("Smaller is %d%n", smaller);
	}
}
