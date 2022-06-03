package publicPrivateProtected;

public class Field {
	
	private Plant plant = new Plant();
	
	
	//size é protected; E field está no mesmo pacote que Plant;
	public Field() {
		System.out.println(plant.size);
	}

}
