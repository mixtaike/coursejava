package inheritance;

public class App {
	
	public static void main(String[] args) {
		
		/*Herança(extends) no Java é quando uma classe filha herda todos os atributos
		 * e metodos de uma classe mãe.*/
		
		Machine machine1 = new Machine();
		
		machine1.start();
		machine1.stop();
		
		/*
		 * No caso dos metodos que aparecem como disponiveis ao chamar um objeto instanciado 
		 * nada mais é que metodos herdados da classe Object do Java.
		 * car1.equals(x), car1.hashCode() e etc...
		 * Quando se instancia um novo objeto de uma classe, além do metodos
		 * proprios da propria classe há também algum metodos que são herdados 
		 * da classe Object do Java.*/
		
		Car car1 = new Car();
		
		/*Além disso temos a herança que pode ser definida na criação de uma nova classe.
		 * Como por exemplo: Classe funcionario herda da classe pessoa. UM funcionarios é
		 * uma pessoa, onde tem atributos e metodos de uma pessoa, além tambem de
		 *  ter atributos de um funcionario. Pessoa(classe mãe) será usada de uma forma generica.*/
		
		
		
		/*Aqui a classe car herdará(extends) da classe Machine
		 * 
		 * Sendo assim, carro compartilhará de todos os atributos e metodos que a classe
		 * Machine tem.*/
		/*Carro agora pode então parar e ligar.*/
		
		/*Carro se tornará a classe FILHA e machine a classe MÃE*/
		
		car1.start();
		/*public void start() {
		System.out.println("Machina started.");
	} metodo q está na classe Machine será impresso*/
		
		car1.stop();
		
		/*Posso adicionar metodos proprios para a classe carro, dessa forma carro terá
		 * metodos que a classe Machine não tem.*/
		
		car1.wipeWindShield();
		
		/*Classe que são do tipo final(constantes) não podem ser herdadas(extendidas)*/
		
		/*Porém é possivel subscrever os metodos herdados, posso pegar o metodo start
		 * e coloca-lo na classe Car, e alterar o que esse método faz. Lembrando que para
		 * subscrever o metodo é necessario que o metodo esteja com o mesmo nome da classe
		 * mae na classe filha
		 * */
		
		car1.start();
		
		/*public void start() {
		System.out.println("car started."); 
	}metodo agora que foi alterado na classe car*/
		
		/*Chamando metodo que irá imprimir um atributo protected*/
		car1.showInfop();
		
		
		/*Não é recomendado subscrever variaveis, apenas metodos.*/
	}
	
	

}
