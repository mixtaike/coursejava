package methods_;

/*Trabalhando com metodos*/

/*Sabemos que pessoa não tem apenas, seu nome, sua idade... mas elas tem também comportamentos. 
 * E comportamento é modelado no Java utilizando metodos.*/

//Classes podem conter:
/*1. Dados - que representam os atributos do objeto, como pessoa, nome, endereço, humor...
 * e para reperesenta isso em java é utilizado a instancia de variaveis.*/
/*2. Metodos* - são funções que a classe tera.*/

//criando classe para representar pessoas
class Person {

	// Instanciando um variavel
	String name;
	int age;

	/* Digamos que eu quero que as pessoas criadas possam dizer seu nome */

	// tudo que tiver um "()" são metodos em Java
	
	//Criando um metodo que ira fazer cada instancia de objeto do tipo pessoa falar 
	void speak() {
		//quando o meotod for chamado será impresso a seguinte mensagem + o nome da pessoa
		System.out.println("My name is " + name);
	}

	void sayHello() {
		System.out.println("Hello there");
	}
}

public class App {

	public static void main(String[] args) {

		/*
		 * Aqui está sendo declarado um variavel chamada person1, que será um objeto do
		 * tipo Person
		 */
		Person person1 = new Person();

		/*
		 * Aqui será definido os valores de cada atributo do meu objeto do tipo Person
		 */

		person1.name = "Julia";
		person1.age = 20;

		/* Criando outro objeto do tipo Person */

		Person person2 = new Person();
		person2.name = "Joao";
		person2.age = 20;

		// imprimindo o nome da pessoa 1
		System.out.println(person1.name);
		
		
		
		//chamado o metodo speake sayHello que está dentro da classe de pessoa
		/*primeiro eu preciso especificar a instancia do objeto que eu quero referencair e depois seu metodo*/
		person1.speak();
		person1.sayHello();

		System.out.println();
		
		person2.speak();
		person2.sayHello();

	}

}
