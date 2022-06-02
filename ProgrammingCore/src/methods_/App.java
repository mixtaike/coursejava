package methods_;

/*Trabalhando com metodos*/

/*Sabemos que pessoa n�o tem apenas, seu nome, sua idade... mas elas tem tamb�m comportamentos. 
 * E comportamento � modelado no Java utilizando metodos.*/

//Classes podem conter:
/*1. Dados - que representam os atributos do objeto, como pessoa, nome, endere�o, humor...
 * e para reperesenta isso em java � utilizado a instancia de variaveis.*/
/*2. Metodos* - s�o fun��es que a classe tera.*/

//criando classe para representar pessoas
class Person {

	// Instanciando um variavel
	String name;
	int age;

	/* Digamos que eu quero que as pessoas criadas possam dizer seu nome */

	// tudo que tiver um "()" s�o metodos em Java
	
	//Criando um metodo que ira fazer cada instancia de objeto do tipo pessoa falar 
	void speak() {
		//quando o meotod for chamado ser� impresso a seguinte mensagem + o nome da pessoa
		System.out.println("My name is " + name);
	}

	void sayHello() {
		System.out.println("Hello there");
	}
}

public class App {

	public static void main(String[] args) {

		/*
		 * Aqui est� sendo declarado um variavel chamada person1, que ser� um objeto do
		 * tipo Person
		 */
		Person person1 = new Person();

		/*
		 * Aqui ser� definido os valores de cada atributo do meu objeto do tipo Person
		 */

		person1.name = "Julia";
		person1.age = 20;

		/* Criando outro objeto do tipo Person */

		Person person2 = new Person();
		person2.name = "Joao";
		person2.age = 20;

		// imprimindo o nome da pessoa 1
		System.out.println(person1.name);
		
		
		
		//chamado o metodo speake sayHello que est� dentro da classe de pessoa
		/*primeiro eu preciso especificar a instancia do objeto que eu quero referencair e depois seu metodo*/
		person1.speak();
		person1.sayHello();

		System.out.println();
		
		person2.speak();
		person2.sayHello();

	}

}
