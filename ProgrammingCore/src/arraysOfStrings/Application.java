package arraysOfStrings;

public class Application {
	
	public static void main(String[] args) {
		
		/*Instanciando um objeto array de strings que ter� 3 elementos*/
		String[] words = new String[3];
		
		//atribuindo valores a cada elemento do array
		words[0]= "hello";
		words[1]= "to";
		words[2]= "you";
		
		//imprimindo o elemento do arary na posi��o 2
		System.out.println(words[2]);
		
		//criando um novo array e atribuindo valores 
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		/*Percorrendo um array utilizando for each*/
		
		
		/*1-Primeiro eu declaro uma variavel que ir� receber o valor de cada posi��o dos elementos do array*/
		/*Ser� do tipo String pois meu array fruits � do tipo String e ser� chamado de fruit.*/
		/*2 - Coloco um ':' logo ap�s � colocando o nome do array que eu irei percorrer*/
		/*O JAVA ira atribuir a "fruit" o valor obtido em cada rodada que o for percorrida no loop do array  */
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//tipos primitivos em java come�am com letra minuscula.
		
	}

}
