package inheritance;

public class Car extends Machine{
	
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	
	public void start() {
		System.out.println("car started.");
	}
	
	public void showInfo() {
	//System.out.println("Car name: "+name); n�o funciona pois varivel name est� privada
		//na classe m�e
	}
	
	public void showInfop() {
		/*Atributo protected da classe m�e Machine*/
		System.out.println("Car name: "+nameP);
		}
}
