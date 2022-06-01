package classesAndObjects;

/*Classe é um template para criar objetos
 * Tudo no mundo real é um objeto, gato, pessoa, carro...
 * O mesmo é no Java, tudo é um objeto, é preciso um lugar para especificar
 * os tipos de diferente objetos que o programa terá, é necessario utilizar classes para isso*/

/*A classe pessoa pode ser usada para criar objetos de pessoa, mas não 
 * representa um pessoa em particular, mas sim de forma universal, generica.*/


//Classes podem conter:
	/*1. Dados - que representam os atributos do objeto, como pessoa, nome, endereço, humor...
	 * e para reperesenta isso em java é utilizado a instancia de variaveis.*/
	/*2. Metodos* - são funções que a classe tera.*/
	
//criando classe para representar pessoas
class Person {
	
	//Instanciando um variavel
	String name;
	int age;
	

}


public class App {

	public static void main(String[] args) {
		
		/*Aqui está sendo declarado um variavel chamada person1, que será um objeto do tipo
		 * Person*/
		Person person1 = new Person();
		
		/*Aqui será definido os valores de cada atributo do meu objeto do tipo Person*/
		
		person1.name = "Julia";
		person1.age = 20;
		
		/*Criando outro objeto do tipo Person*/
		
		/*1 - Person é o tipo da varaivel que estou criando
		 *2- person2 o nome da variavel
		 *3- que será irá receber um novo objeto de Person */
		Person person2 = new Person();
		person2.name = "Joao";
		person2.age = 20;
		
		//imprimindo o nome da pessoa 1
		System.out.println(person1.name);
		

	}

}
