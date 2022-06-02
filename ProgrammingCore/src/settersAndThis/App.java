package settersAndThis;

class Frog {
	
	/*Classe est� sendo encapsulada, atributos n�o podem ser acessados diretamente como anteriormente:
	 * frogObject.name = "sapo" - n�o funciona mais por causa do PRIVATE do atributo.
	 * Para definir os valores dos atributos � necessario criar um metodo que n�o retorna nada
	 * chamado setNomeDoAtributo(String nome) que recebe como parametro o valor do atributo para ent�o depois esse
	 * valor ser passado para o atributo dentro do metodo:
	 * public void setName(String name) {this.name = name;}
	 * this.name se refencia a variavel de instancia que est� dentro da classe globalmente, e (String name)
	 * variavel que vira pelo paremetro � uma variavel de escopo:
	 * this.name(varivel global) = name(recebe variavel de escopo)*/
	
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}



public class App {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name = "Bertie" ;- nao funciona mais por causa do encapsulamento
		//frog1.age = 1; - - nao funciona mais por causa do encapsulamento
		
		/*Definindo os dados dos atributos utilizando o encapsulamento*/
	
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		
	}

}
