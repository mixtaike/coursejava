package publicPrivateProtected;

public class Plant {
	
	//N�O � uma boa pratica
	/*A ideia principal e correta � encapsular os atributos, esconde-los do mundo.
	 * Fazer as pessoas acessarem os atributos a partir de metodos.*/
	public String name;
	
	// Pratica aceitavel --- � uma constante
	public final static int ID = 8;
	 
	/*private s� permite acessar o atributo dentro da propria classe*/
	private String type;
	
	/*atributo est� protegido por�m pode ser acessado a partir de classes filhas e dentro
	 * se seu proprio pacote.*/
	protected String size;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
	}
	

}
