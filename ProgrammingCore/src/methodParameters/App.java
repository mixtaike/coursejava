package methodParameters;

class Robot {
	
	/*Criando um metodo passando um parametro de text do tipo String*/
	public void speak(String text) {
		/*imprimindo o que foi obtido no parametro*/
		System.out.println(text);
	}
	
	/*Criando um metodo passando um parametro de height do tipo int*/
	public void jump(int height) {
		System.out.println("Jumping: "+height);
	}
	
	/*Criando um metodo passando dois parametro, String e double*/
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction "+direction);
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		
		/*Instanciando um objeto do tipo robot*/
		Robot sam = new Robot();
		
		/*Chamando o metodo speak e mandando para o parametro o tipo String*/
		sam.speak("Hi, I'm sam");
		/*Chamando o metodo jump e mandando para o parametro o tipo int*/
		sam.jump(7);
		
		/*Chamando o metodo move e mandando os parametro em ordem requerida, String e double*/
		sam.move("West", 12.2);
		
		
		/*Ao executar o metodo o conteudo armazenado dentro da variavel "greeting" será impresso.
		 * Isso acontece pq "greeting" é apenas uma referencia de um dado que está armazenado, desta 
		 * forma o texto que será impresso é oq esta armazenado dentro dessa variavel.
		 * Para que isso acontece a variavel precisa ser do mesmo tipo que o parametro requerido.
		 * "greeting" se refere a um dado que está dentro de uma variavel, esse dado será inserido
		 * dentro do parametro caso seja passado.*/
		String greeting = "hello there";
		sam.speak(greeting);
		
		
	}
	
	

}
