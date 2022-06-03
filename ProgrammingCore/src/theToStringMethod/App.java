package theToStringMethod;

class Frog {
	
	/*toString é utilizado para criar uma representação que possibilita a identificação
	 * do objeto.*/
	
	private int id;
	private String name;
	
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString1() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" -: ").append(name);
		return sb.toString();
	}
	
	//ou 
	
	public String toString() {

		return String.format("%4d :- %s",id, name);
	}
	
	
	
	
}

class Frog2 {
	//classe sem o metodo to string
}
public class App {
	
	public static void main(String[] args) {
		
		
		/*Quando existe o metodo toString na classe q foi instanciada um objeto,
		 * se eu pedir pra imprimir esse objeto, o toString será chamado.
		 * Caso eu não tenha esse metodo, será impresso a referencia da memoria que 
		 * o objeto se encontra(endereço da memoria), também conhecido com HASHCODE. */
		/*Instanciando um objeto da classe Frog que contem o metodo toString*/
		Frog frog1 = new Frog(5, "Bob");
		
		/*imprimindo o objeto*/
		System.out.println(frog1);
		
		/*Instanciando um objeto de uma classe que não tem o metodo toString*/
		
		Frog2 frog2 = new Frog2();
		
		System.out.println(frog2);
	}
	

}
