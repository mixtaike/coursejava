package theToStringMethod;

class Frog {
	
	/*toString � utilizado para criar uma representa��o que possibilita a identifica��o
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
		 * se eu pedir pra imprimir esse objeto, o toString ser� chamado.
		 * Caso eu n�o tenha esse metodo, ser� impresso a referencia da memoria que 
		 * o objeto se encontra(endere�o da memoria), tamb�m conhecido com HASHCODE. */
		/*Instanciando um objeto da classe Frog que contem o metodo toString*/
		Frog frog1 = new Frog(5, "Bob");
		
		/*imprimindo o objeto*/
		System.out.println(frog1);
		
		/*Instanciando um objeto de uma classe que n�o tem o metodo toString*/
		
		Frog2 frog2 = new Frog2();
		
		System.out.println(frog2);
	}
	

}
