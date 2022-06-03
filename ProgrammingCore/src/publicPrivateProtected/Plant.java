package publicPrivateProtected;

public class Plant {
	
	//NÃO é uma boa pratica
	/*A ideia principal e correta é encapsular os atributos, esconde-los do mundo.
	 * Fazer as pessoas acessarem os atributos a partir de metodos.*/
	public String name;
	
	// Pratica aceitavel --- é uma constante
	public final static int ID = 8;
	 
	/*private só permite acessar o atributo dentro da propria classe*/
	private String type;
	
	/*atributo está protegido porém pode ser acessado a partir de classes filhas e dentro
	 * se seu proprio pacote.*/
	protected String size;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
	}
	

}
