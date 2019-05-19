/*
 * Objetivo: 15.7 (Gerador de palavra de n�mero de telefone) Os teclados de telefone padr�o cont�m os d�gitos de zero a nove. Os n�meros 2 a 9 t�m
 * tr�s letras associadas a cada um (Figura 15.17). Muitas pessoas acham dif�cil memorizar n�meros de telefone, ent�o utilizam a correspond�ncia
 * entre d�gitos e letras para criar palavras de sete letras que correspondem a seus n�meros de telefone. Por exemplo, uma pessoa cujo
 * n�mero de telefone � 686-2377 talvez adote a correspond�ncia indicada na Figura 15.17 para desenvolver a palavra de sete letras �NUMBERS�.
 * Cada palavra de sete letras se associa a exatamente um n�mero de telefone de sete d�gitos. Um restaurante que deseja ampliar seu
 * esquema de entregas em domic�lio (�takeout�, em ingl�s) seguramente poderia fazer isso com o n�mero 825-3688 (isto �, �TAKEOUT�).
 * 
 * D�gito 	Letras | D�gito	 Letras	| D�gito  Letras
 *	 2 		A B C  |  5 	  J K L |   8	  T U V
 * 	 3 		D E F  |  6 	  M N O |   9 	  W X Y
 *   4 		G H I  |  7 	  P R S |
 * Figura 15.17 | D�gitos e letras do teclado do telefone.
 * 
 * Cada n�mero de telefone de sete letras corresponde a diversas palavras de sete letras, mas a maioria delas representa justaposi��es irreconhec�veis
 * das letras. � poss�vel, por�m, que o propriet�rio de uma barbearia ficasse contente em saber que o n�mero de telefone de seu
 * sal�o, 424-7288, corresponde a �HAIRCUT� (que significa �corte de cabelo�). Um veterin�rio com o n�mero de telefone 738-2273 ficaria
 * satisfeito em saber que seu n�mero corresponde � palavra de sete letras �PETCARE� (que significa �assist�ncia a animais de estima��o�).
 * Um vendedor de autom�veis ficaria animado ao saber que o n�mero de telefone de sua loja, 639-2277, corresponde a �NEWCARS� (que significa
 * �carros novos�).
 * Escreva um programa que, dado um n�mero de sete d�gitos, utiliza um objeto PrintStream para gravar em um arquivo cada poss�vel
 * combina��o de palavras de sete letras correspondente a esse n�mero. H� 2.187 (37) dessas combina��es. Evite n�meros de telefone com
 * os d�gitos 0 e 1.
 * 
 * Autor: Gustavo Alves
 */

package ch15.ex15_07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GeradorDePalavraDeN�meroDeTelefone {
	private static int[] digitos = new int[10];
	private static final String[] letras = { null, null, "A B C", "D E F", " G H I ", "J K L", "M N O", " P R S",
			"T U V", "W X Y" };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite seu n�mero de telofone: ");
		String phoneNumberString = input.nextLine();
		input.close();

		write(separetor(phoneNumberString));

	}

	// Evite n�meros de telefone com os d�gitos 0 e 1.
	public static void isNumberValid() {

	}

	public static int[] separetor(String phoneString) {
		int[] phoneNumbers = new int[phoneString.length()];

		for (int i = 0; i < phoneNumbers.length; i++)
			phoneNumbers[i] = Integer.parseInt(phoneString.substring(i, i + 1));

		return phoneNumbers;

	}

	public static void write(int[] phoneNumber) {
		String combinations = "";
		PrintStream printStream = null;
		try {
			printStream = new PrintStream(Files.newOutputStream(Paths.get("combinations.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int counter = 0;

		for (int i = 0; i < 3; i++) {
			String[] tokens2 = letras[phoneNumber[0]].split(" ");
			for (int j = 0; j < 3; j++) {
				String[] tokens3 = letras[phoneNumber[1]].split(" ");
				for (int j2 = 0; j2 < 3; j2++) {
					String[] tokens4 = letras[phoneNumber[2]].split(" ");
					for (int k = 0; k < 3; k++) {
						String[] tokens5 = letras[phoneNumber[3]].split(" ");
						for (int k2 = 0; k2 < 3; k2++) {
							String[] tokens6 = letras[phoneNumber[4]].split(" ");
							for (int l = 0; l < 3; l++) {
								String[] tokens7 = letras[phoneNumber[5]].split(" ");
								for (int l2 = 0; l2 < 3; l2++) {
									String[] tokens8 = letras[phoneNumber[6]].split(" ");
									for (int m = 0; m < 3; m++) {
										String[] tokens9 = letras[phoneNumber[6]].split(" ");

										combinations = String.format("%d = %s%s%s%s%s%s%s%s%n", ++counter, tokens2[i],
												tokens3[j], tokens4[j2], tokens5[k], tokens6[k2], tokens7[l],
												tokens8[l2], tokens9[m]);

										System.out.print(combinations);
										printStream.format("%s", combinations);
									}
								}
							}
						}
					}
				}
			}

		}

	}

}
