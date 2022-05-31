package arrays;

public class Application {
	
	public static void main(String[] args) {
		
		/*Para relembrar: "int value"
		 *Foi escrito int nome da avriavel,que significa criar memoria suficiente
		 para armazenar um inteiro 32 bits. */
		int value = 7;
		/*e "= 7 " que significa que estou dizendo para armazenar
		 * um certo valor naquela memoria. */
		
		/*Declarando um array, uma matriz*/
		int[] values;
		
		/*Estou dizendo que essa  matriz ter� espa�o para armazenar 3 
		 * variaveis do tipo inteiroa/
		imporante lembrar que a contagem come�a a parti do numero 0, sendo
		assim as posi��es dos valores ser�o 0,1,2 - equivalente ao espa�o para
		3 variaveis. */
		values = new int[3];
		
		/*inserindo valores nas posi��es de cada variavel na matriz*/
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		
		/*imprindo cada posi��o da matriz*/
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		/*Percorrendo um array utilizando loop*/
		
		/*iniciando a variavel int 0, antes de inicar o loop
		 para ir de i at� o tamanho de values
		 -lenght se refere ao total total de um array-
		 por fim incremente +1 em i*/
		for(int i =0; i<values.length; i++) {
			//imprima values[] na posi��o atual de acordo com o valor de i
			System.out.println(values[i]);
		}
		
		/*Iniciando um array e declarando valor*/
		
		int[]  numbers = {5, 6, 7};
		
		for(int i =0; i< numbers.length; i++ ) {
			System.out.println(numbers[i]);
		}
	}
}
