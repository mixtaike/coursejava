package publicPrivateProtected;

public class App {
	
	public static void main(String[] args) {
		
		/*private ---- acesso apenas na classes que est�
		 * public ---- acesso permitido de qualquer lugar
		 * protected --- acesso na classe que est�, acesso nas subclasses(classes filhas) e no mesmo pacote.
		 * no modifier --- acesso apenas no mesmo pacote.*/
		
		/*Lembrando que os modificadores de acesso n�o funcionam na cria��o da classe em s�.
		 * public(n�o funciona private ou protected) class Plant {}
		 * Funcionam apenas nos atributos da classe.*/
		
		
		
		/*Se uma variavel for declarada como public, ela 
		 * pode ser acessada de qualquer lugar.*/
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
	//n�o funciona	System.out.println(plant.type); - type � privado
		
	
		/*Quando um atributo � definido sem um modificador de acesso,
		 * o atributo ter� visibilidade "public" dentro do pacote que est�.*/
	
	}

}
