package switch_;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
		
		/*usado como um condicional if, porém deve deve ser utilizado
		 nas condições utilizando variaveis constantes, não há como 
		 ter blocos de caso(como os blocos if's) para validar variaveis.*/
		//só pode ter uma variavel dentro do swicth	
		switch (text) {
		/*caso a variavel text carregue o valor "start"*/
		case "start":
			//imprima...
			System.out.println("Machine started!");
			//pare a aplicação!
			break;
		
		/*senao, caso a variavel text carregue o valor "stop"*/
		case "stop":
			//imprima...
			System.out.println("Machine stopped.");
			//pare a aplicação!
			break;
		
			/*caso nenhum caso acima seja executado então*/
		default:
			//imprima...
			System.out.println("Command not recognized.");

		}
		
		/*constantes: valores que não se modificam no decorrer da
		 * execução do programa.*/

	}

}
