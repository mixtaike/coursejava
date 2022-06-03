package interfaces;

public class App {
	
	
	/*Foram criadas duas classes, Machine e Person. Essas classes não possuem nada
	 * em comum, entretanto digamos que eu queira que essas duas classes
	 * tenha o metodo showInfo() obrigatoriamente. O Java oferece um mecanismo
	 * para formalizar essa necessidade em comum, com a interface é possivel
	 * formalizar os metodos que serão obrigatorios de se ter quando uma determinada
	 * classe adotar essa formalização.*/
	
	
	/*É possivel implementar varias interfaces:
	 * public class Machine implements Info,X,X{}
	 * Elas devem ser separadas por uma ','*/
	

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Julia");
		person1.greet();
		
		mach1.showInfo();
		person1.showInfo();
		
		
		/*Algumas pessoas fazem o design de programas se baseando a partir
		 * da criação de interfaces. Definindo assim como os objetos interagirão
		 * uns com os outros, dessa forma depois só é necessario criar os objtos
		 * que irão implementar essas interfaces.   */
		
		
		
	}
	
	

}
