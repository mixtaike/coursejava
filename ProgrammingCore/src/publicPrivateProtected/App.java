package publicPrivateProtected;

public class App {
	
	public static void main(String[] args) {
		
		/*private ---- acesso apenas na classes que está
		 * public ---- acesso permitido de qualquer lugar
		 * protected --- acesso na classe que está, acesso nas subclasses(classes filhas) e no mesmo pacote.
		 * no modifier --- acesso apenas no mesmo pacote.*/
		
		/*Lembrando que os modificadores de acesso não funcionam na criação da classe em sí.
		 * public(não funciona private ou protected) class Plant {}
		 * Funcionam apenas nos atributos da classe.*/
		
		
		
		/*Se uma variavel for declarada como public, ela 
		 * pode ser acessada de qualquer lugar.*/
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
	//não funciona	System.out.println(plant.type); - type é privado
		
	
		/*Quando um atributo é definido sem um modificador de acesso,
		 * o atributo terá visibilidade "public" dentro do pacote que está.*/
	
	}

}
