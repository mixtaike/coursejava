package gettersAndReturnValues;


/*Retornando valores*/

/*Encapsulamento
 *Significa que os dados que são declarados na classe ficarão "escondidos" de outras classes. 
 *No momento o metodo main está acessando diretamente minha classe Person.*/



class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: "+ name);
	}
	
	/*Retornando valores*/
	/*Foi criado um metodo para calcular o tempo de aposentadoria de uma pessoa.
	 * void = não retorna nada.
	 * Para retornar um valor manipulavel é necessario que no metodo ao inves de usar "void" é necessario
	 * que seja colocado o tipo de dado que eu precise que esse metodo retorne. No exemplo abaixo eu
	 * quero retornar um int referente a idade, então é necessario que no lugar do void eu coloque "int".
	 * Além disso preciso sianlizar ao metodo que dado que quero retornar utilizando a palavra "return"*/
	
	void calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		System.out.println(yearsLeft);
	}
	
	//metodo que retorna um dado do tipo int para ser manipulado caso necessario.
	int calculateYearsToRetirementReturnInt() {
		int yearsLeft = 65 - age;
		
		
		//avisando ao metodo que dado do tipo int irei retornar.*obrigatorio
		return yearsLeft;
	}
	
	//Criando metodos acessores para retornar os dados de person
	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
	
	}

public class App {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age =  25;
		
		person1.speak();
		person1.calculateYearsToRetirement();
		
		/*Retornando valores*/
		//manipulando o dado que será retorna do metodo calculateYearsToRetirementReturnInt()
		
		int years = person1.calculateYearsToRetirementReturnInt();
		
		System.out.println(years);
		
		//Guardando os dados retornados do metodo acessor get e armazenando em  variaveis
		int age = person1.getAge();
		String name = person1.getName();
		
		//imprimindo os valores
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		
		
		
	}

}
