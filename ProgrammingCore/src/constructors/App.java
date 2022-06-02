package constructors;

/*Um construtor é um metodo especial que roda cada vez que se é criado
 * uma nova instancia de uma classe.*/

class Machine{
	
	private String name;
	private int code;
	
	/*Criando um construtor:
	 * - um construtor deve ter o mesmo nome da classe.*/
	
	/*Chamando um construtor dentro de outro construtor*/
	public Machine() {
		this("Arnie",0);//é necessario que esteja na primeira linha do construtor principal
		System.out.println("Constructor Running");
		name = "Arnie";
	}
	
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		
		/*Criando uma instancia da classe machine*/
		/*Só o fato de cria uma nova instancia de Machine, o construtor é chamado e é executado.*/
		
		//1°construtor
		/*Chamando um construtor sem parametros*/
		Machine machine1 = new Machine();
		
		//2°construtor
		/*Chamando um construtor com parametros.
		 * O JAVA consegue deferenciar os cosntrutores existentes pelos parametros que eles tem,
		 * sabendo em cada caso qual construtor chamar.*/
		Machine machine2 = new Machine("Julia");
		
	
		//3°construtor
		/*Chamando um construtor com parametros.
		 * O JAVA consegue deferenciar os cosntrutores existentes pelos parametros que eles tem,
		 * sabendo em cada caso qual construtor chamar.*/
		Machine machine3 = new Machine("Joana", 0);
		
	}

}
