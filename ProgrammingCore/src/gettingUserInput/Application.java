package gettingUserInput;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/*
		 * Entrada de dados - Criando uma variavel que irá referenciar um objeto do tipo
		 * Scanner - criando um obejto scanner
		 */

		// STRING

		// instanciando um objeto do tipo scanner para entrada de dados
		Scanner input = new Scanner(System.in);

		// solicitando no console um texto
		System.out.println("Enter a line of text: ");

		// habilitando a entrada de dados e atribuindo a uma variavel
		String line = input.nextLine();

		// imprimindo o que foi digitado
		System.out.println("You entered: " + line);

		// NUMERO INTEIRO

		// instanciando um objeto do tipo scanner para entrada de dados
		Scanner inputInt = new Scanner(System.in);

		// solicitando no console um texto
		System.out.println("Enter an integer: ");

		// habilitando a entrada de dados e atribuindo a uma variavel
		int lineInt = input.nextInt();

		// imprimindo o que foi digitado
		System.out.println("You entered: " + lineInt);

		// NUMERO COM PONTO FLUTUANTE

		// instanciando um objeto do tipo scanner para entrada de dados
		Scanner inputDouble = new Scanner(System.in);

		// solicitando no console um texto
		System.out.println("Enter a floating point value: ");

		// habilitando a entrada de dados e atribuindo a uma variavel
		double lineDouble = input.nextDouble();

		// imprimindo o que foi digitado
		System.out.println("You entered: " + lineDouble);

	}

}
