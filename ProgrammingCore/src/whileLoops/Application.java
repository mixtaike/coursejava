package whileLoops;

public class Application {

	public static void main(String[] args) {

		/* control+shift+f organizar código */
		
		/*Estruturas lógica simples*/
		
		int value = 10;
		boolean loop = value < 20;
		boolean loop2 = 6 < 1;
		System.out.println(loop);
		System.out.println(loop2);
		int value2 = 0;
		
		/*Loop*/
		//Condição - enquanto value2 for menor que 10 entao...
		while(value2  < 10)
		{
			//imprima hello + value2
			System.out.println("Hello" + value2);
			//acrescente +1 na minha variavel value2
			value2 = value2 + 1;
		}
		
	}

}
