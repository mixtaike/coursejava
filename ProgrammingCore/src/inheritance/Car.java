package inheritance;

public class Car extends Machine{
	
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	
	public void start() {
		System.out.println("car started.");
	}
	
	public void showInfo() {
	//System.out.println("Car name: "+name); não funciona pois varivel name está privada
		//na classe mãe
	}
	
	public void showInfop() {
		/*Atributo protected da classe mãe Machine*/
		System.out.println("Car name: "+nameP);
		}
}
