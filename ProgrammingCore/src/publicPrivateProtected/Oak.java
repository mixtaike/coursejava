package publicPrivateProtected;

public class Oak extends Plant{
	
	public Oak( ) {
		
		// N�o ir� funcionar --- type est� privado na classe mae
		//type = "tree";
		
		
		/*Ir� funcionar normalmente. Pois o atributo size � protected.
		 * Protected significa que o atributo pode ser acessado a partir de sua classe de cria��o
		 * e acessado tamb�m em suas classes filhas e dentro de seu pacote.*/
		this.size = "large";
	}

}
