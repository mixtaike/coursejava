package if_;

public class Application {

	public static void main(String[] args) {

		/* Testando um condição booleana simples */

		/* != diferente de - true */
		boolean cond = 5 != 2;

		System.out.println(cond);

		/* == igual a - false */
		cond = 5 == 2;
		System.out.println(cond);

		/* maior > que - true */
		cond = 5 > 2;
		System.out.println(cond);

		/* menor < que - false */
		cond = 5 < 2;
		System.out.println(cond);

		/* maior ou igual >= que - true */
		cond = 5 >= 2;
		System.out.println(cond);

		/* menor ou igual >= que - false */
		cond = 5 <= 2;
		System.out.println(cond);

		/* '=' sinal de atribuição */
		/* '==' sinal de igual a algo */

		/* Utilizando a estruturado condicional IF */

		if (4 == 4) {
			System.out.println("Yes, it's true");

		}

		if (4 != 4) {
			System.out.println("Yes, it's true");

		}

		int myInt = 20;

		if (myInt < 30) {
			System.out.println("Yes, it's true");

		}

		/* SE MY INT FOR MENOR QUE 10 ENTAO... */
		if (myInt < 10) {
			// IMPRIME
			System.out.println("Yes, it's true");

		}

		/* SENÃO */
		else {
			// IMPRIMA
			System.out.println("No, it's false");
		}

		/* Utilizando a estruturado condicional IF COMPOSTA */

		myInt = 20;

		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		}

		else if (myInt > 20) {
			System.out.println("No, it's false!");
		}
		
		/*vai cair no else caso ela não se encaixe em nenhuma
		 das condições acima.*/
		
		else {
			System.out.println("None of the above!");
		}
		
		/*Exemplo utilizando loop WHILE e IF*/
		
		int loop = 0;
		while(true) {
			System.out.println("Looping  + loop");
			
			if (loop == 5) {
				break;
			}
			
			loop++;
			System.out.println("Running");
		}

	}

}
