/*
 * Objetivo: 2.33 (Calculadora de �ndice de massa corporal) Introduzimos a calculadora de �ndice de massa corporal (IMC) no 
 * Exerc�cio 1.10. As f�rmulas para calcular o IMC s�o 
 * 
 * IMC = (pesoEmLibras � 703) / alturaEmPolegadas�
 * 				  ou
 * IMC = pesoEmQuilogramas / alturaEmMetros�
 * 
 * Crie um aplicativo de calculadora IMC que leia o peso do usu�rio em libras e a altura em polegadas (ou, se preferir,
 * o peso em quilogramas e a altura em metros) e, ent�o, calcule e exiba o �ndice de massa corporal dele. Al�m disso, 
 * que exiba as seguintes informa��es do Department of Health and Human Services/National Institutes of Health, assim
 * o usu�rio pode avaliar o seu IMC:
 * 
 * BMI VALUES
 * Underweight:  less than 18.5
 * Normal:		 between 18.5 and 24.9
 * Overweight:   between 25 and 29.9
 * Obese: 		 30 or greater
 * 
 * [Nota: neste cap�tulo, voc� aprendeu a utilizar o tipo int para representar n�meros inteiros. Os c�lculos de IMC, quando
 * feitos com valores int, produzir�o resultados com n�meros inteiros. No Cap�tulo 3, voc� aprender� a utilizar o tipo double
 * para representar n�meros com pontos decimais. Quando os c�lculos de IMC s�o realizados com doubles, eles produzir�o n�meros
 * com pontos decimais � esses s�o chamados de n�meros de �ponto flutuante�.]
 * 
 * Autor: Gustavo Alves
 */

package ch02.ex02_33;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double pesoEmQuilogramas;
		double alturaEmMetros;
		double imc;

		System.out.print("Digite seu peso (em kg): ");
		pesoEmQuilogramas = scanner.nextDouble();

		System.out.print("Digite sua altura(em metros): ");
		alturaEmMetros = scanner.nextDouble();
		scanner.close();

		imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

		System.out.printf("%nSeu IMC � %,.2f%n%n", imc);

		System.out.println(
				"Informa��es do Department of Health and Human Services/National Institutes of Health\n\tBMI VALUES\r\n"
						+ "Abaixo do peso:  menos de 18,5\r\n" + "Normal:          entre 18,5 e 24,9\r\n"
						+ "Excesso de peso: entre 25 e 29,9\r\n" + "Obeso:       	30 ou maior");
	}
}
