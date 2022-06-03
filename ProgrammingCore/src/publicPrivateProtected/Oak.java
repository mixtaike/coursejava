package publicPrivateProtected;

public class Oak extends Plant{
	
	public Oak( ) {
		
		// Não irá funcionar --- type está privado na classe mae
		//type = "tree";
		
		
		/*Irá funcionar normalmente. Pois o atributo size é protected.
		 * Protected significa que o atributo pode ser acessado a partir de sua classe de criação
		 * e acessado também em suas classes filhas e dentro de seu pacote.*/
		this.size = "large";
	}

}
