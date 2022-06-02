package StringBuilderAndStringFormatting;

public class App {
	
	public static void main(String[] args) {
		
		
		//Ineficiente pois sempre cria uma nova string, consumindo memoria
		String info = "";
		
		info += "My name is Julia.";
		info += " ";
		info += "I'm a builder.";
		
		System.out.println(info);
		
		/*Aqui a string NÃO está sendo recriada a cada nova modificação, mas sim a string atual
		 * está sendo modificada a cada alteração, sendo mais eficiente que o exemplo anterior,
		 * onde no exmeplo anterior um nova string era criada toda vez.*/
		StringBuilder sb= new StringBuilder();
		sb.append("My name é Julia.");
		sb.append(" ");
		sb.append("I'm poor.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name é JoANA")
		.append(" ")
		.append("I'm a skydriver");
		
		System.out.println(s);
		
		////Formating////////////////
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline");
		System.out.println("More text");
		
		
		/*utilizando %d para formatar inteiros*/
		/*printf= significa print format*/
		/*%d significa numero, o printf procura o argumento compativel com o %d(seguindo a ordem)
		 * de argumentos, então ele irá substituir o simbolo pelo valor(argumento) passado após a ','*/
		System.out.printf("Total cost %d\n",5);
		
		System.out.printf("Total cost %d; quantity is %d\n",5, 120);
		
		/*espaçamento*/
		
		System.out.printf("Total cost %-10d; quantity is %d\n",5, 120);
		
		for (int i =0;i <20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		System.out.println();
		
		for (int i =0;i <20; i++) {
			System.out.printf("%-2d: some text here\n", i);
		}
		
		/*utilizando %s para strings*/
		
		for (int i =0;i <20; i++) {
			System.out.printf("%-2d: %s\n", i, "some text here");
		}
		
		/*formatação para numeros com pontos flutuantes %f*/
		
		System.out.printf("Total value: %f\n", 5.6);
		
		/*diminuindo o numero de casas decimais*/
		System.out.printf("Total value: %.2f\n", 5.6);
		
		/*espaçamento*/
		System.out.printf("Total value: %6.1f\n", 343.23423);
	}

}
