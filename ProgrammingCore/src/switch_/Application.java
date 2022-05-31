package switch_;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
		
		/*usado como um condicional if, por�m deve deve ser utilizado
		 nas condi��es utilizando variaveis constantes, n�o h� como 
		 ter blocos de caso(como os blocos if's) para validar variaveis.*/
		//s� pode ter uma variavel dentro do swicth	
		switch (text) {
		/*caso a variavel text carregue o valor "start"*/
		case "start":
			//imprima...
			System.out.println("Machine started!");
			//pare a aplica��o!
			break;
		
		/*senao, caso a variavel text carregue o valor "stop"*/
		case "stop":
			//imprima...
			System.out.println("Machine stopped.");
			//pare a aplica��o!
			break;
		
			/*caso nenhum caso acima seja executado ent�o*/
		default:
			//imprima...
			System.out.println("Command not recognized.");

		}
		
		/*constantes: valores que n�o se modificam no decorrer da
		 * execu��o do programa.*/

	}

}
