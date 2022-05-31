package doWhile;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		
		/*Jeito de fazer while com sentinela*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		
		while( value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		
		}
		
		System.out.println("Got 5!");
	
	
	/*Jeito IDEAL de fazer while com sentinela*/
	
		/*no exemplo acima a variavel � declarada globalmente,
		 podendo ser utilizada fora de um bloco de c�digo*/
		
	/*fa�a*/
		/*criando variavel globalmente*/
		int value2;
	do {
		/*pe�a um numero*/
		System.out.println("Enter a number: ");
		/*habilite a entrada de dados e atribua a uma variavel*/
		
		//	int value2 = scanner.nextInt();
		/*a variavel n�o pode ser declarada no fun��o caso 
		 *seja necessario seu uso fora desse bloco de c�digo*/
		
		value2 = scanner.nextInt();
	
		
	}
	/*Se a variavel tivesse sido criando no escopo de bloco de c�digo
	 * acima o bloco while n�o teria acesso a mesma*/
	
	/*enquanto essa variavel for diferente de 5*/
	while(value2 != 5);
	
	/*saida do loop ap�s usuario digitar 5*/
	System.out.println("Got 5!");
}

}
