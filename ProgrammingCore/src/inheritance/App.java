package inheritance;

public class App {
	
	public static void main(String[] args) {
		
		/*Heran�a(extends) no Java � quando uma classe filha herda todos os atributos
		 * e metodos de uma classe m�e.*/
		
		Machine machine1 = new Machine();
		
		machine1.start();
		machine1.stop();
		
		/*
		 * No caso dos metodos que aparecem como disponiveis ao chamar um objeto instanciado 
		 * nada mais � que metodos herdados da classe Object do Java.
		 * car1.equals(x), car1.hashCode() e etc...
		 * Quando se instancia um novo objeto de uma classe, al�m do metodos
		 * proprios da propria classe h� tamb�m algum metodos que s�o herdados 
		 * da classe Object do Java.*/
		
		Car car1 = new Car();
		
		/*Al�m disso temos a heran�a que pode ser definida na cria��o de uma nova classe.
		 * Como por exemplo: Classe funcionario herda da classe pessoa. UM funcionarios �
		 * uma pessoa, onde tem atributos e metodos de uma pessoa, al�m tambem de
		 *  ter atributos de um funcionario. Pessoa(classe m�e) ser� usada de uma forma generica.*/
		
		
		
		/*Aqui a classe car herdar�(extends) da classe Machine
		 * 
		 * Sendo assim, carro compartilhar� de todos os atributos e metodos que a classe
		 * Machine tem.*/
		/*Carro agora pode ent�o parar e ligar.*/
		
		/*Carro se tornar� a classe FILHA e machine a classe M�E*/
		
		car1.start();
		/*public void start() {
		System.out.println("Machina started.");
	} metodo q est� na classe Machine ser� impresso*/
		
		car1.stop();
		
		/*Posso adicionar metodos proprios para a classe carro, dessa forma carro ter�
		 * metodos que a classe Machine n�o tem.*/
		
		car1.wipeWindShield();
		
		/*Classe que s�o do tipo final(constantes) n�o podem ser herdadas(extendidas)*/
		
		/*Por�m � possivel subscrever os metodos herdados, posso pegar o metodo start
		 * e coloca-lo na classe Car, e alterar o que esse m�todo faz. Lembrando que para
		 * subscrever o metodo � necessario que o metodo esteja com o mesmo nome da classe
		 * mae na classe filha
		 * */
		
		car1.start();
		
		/*public void start() {
		System.out.println("car started."); 
	}metodo agora que foi alterado na classe car*/
		
		/*Chamando metodo que ir� imprimir um atributo protected*/
		car1.showInfop();
		
		
		/*N�o � recomendado subscrever variaveis, apenas metodos.*/
	}
	
	

}
