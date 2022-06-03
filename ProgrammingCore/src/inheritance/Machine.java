package inheritance;

public class Machine {
	
	/*variaveis e metodos privados n�o podem ser herdados.
	 * Apenas variaveis e metodos public ou protected.*/
	private String name = "Machine type 1";
	
	
	/*Protected significa que o atributo ou metodo pode ser acessado em qualquer
	 * lugar dentro do pacote e tamb�m pelas classes filhas.*/
	protected String nameP = "Machine type 1";
	
	
	public void start() {
		System.out.println("Machina started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
		
}
