package publicPrivateProtected;

public class Field {
	
	private Plant plant = new Plant();
	
	
	//size � protected; E field est� no mesmo pacote que Plant;
	public Field() {
		System.out.println(plant.size);
	}

}
