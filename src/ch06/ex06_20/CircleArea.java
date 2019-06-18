/*
 * Objetivo: 6.20 (�rea de c�rculo) Escreva um aplicativo que solicita ao usu�rio o raio de um c�rculo e utiliza
 * um m�todo chamado circleArea para calcular a �rea do c�rculo.
 * 
 * Autor: Gustavo Alves
 */

package ch06.ex06_20;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter radius of a circle: ");
		double radius = scanner.nextDouble();

		System.out.printf("Circle area is %,.2f cm�", circleArea(radius));
		scanner.close();
	}

	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
