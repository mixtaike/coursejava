package interfaces;

/*Implementando a interface Info na classe Machine*/
public class Machine implements Info{
	
	/*Após implementar(implements) a interface é necessario, adicionar os metodos
	 * que a interface possui. Caso não seja adicionado será apresentado
	 * um erro. Lembrando que interface é uma especie de contrato que se adotado
	 * deve ser implementado junto de todos os seus metodos.*/
	
	
	private int id =7;
	
	public void start() {
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID id: "+id);
		
	}

	

}
