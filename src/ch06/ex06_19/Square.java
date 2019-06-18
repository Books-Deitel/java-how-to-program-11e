/*
 * Objetivo: 6.19 (Exibindo um quadrado de qualquer caractere) Modifique o m�todo criado no
 * Exerc�cio 6.18 para receber um segundo par�metro do tipo char chamado fillCharacter. 
 * Forme o quadrado utilizando o char fornecido como um argumento. Portanto, se side for 5
 * e fillCharacter for #, o m�todo deve exibir
 * 
 * 	#####
 * 	#####
 * 	#####
 * 	#####
 * 	#####
 * 
 * Utilize a seguinte instru��o (em que input � um objeto Scanner) para ler um caractere do
 * usu�rio no teclado:
 * 		char fill = input.next().charAt(0);
 * 
 * Autor: Gustavo Alves
 */

package ch06.ex06_19;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side of square: ");
		int side = input.nextInt();

		System.out.print("Enter a character: ");
		char fill = input.next().charAt(0);
		input.close();

		squareOf(side, fill);
	}

	public static void squareOf(int side, char fillCharacter) {
		String result = "";

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++)
				result += fillCharacter;

			result += "\n";
		}

		System.out.println(result);
	}
}
