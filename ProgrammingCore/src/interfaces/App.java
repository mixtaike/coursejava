package interfaces;

public class App {
	
	
	/*Foram criadas duas classes, Machine e Person. Essas classes n�o possuem nada
	 * em comum, entretanto digamos que eu queira que essas duas classes
	 * tenha o metodo showInfo() obrigatoriamente. O Java oferece um mecanismo
	 * para formalizar essa necessidade em comum, com a interface � possivel
	 * formalizar os metodos que ser�o obrigatorios de se ter quando uma determinada
	 * classe adotar essa formaliza��o.*/
	
	
	/*� possivel implementar varias interfaces:
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
		 * da cria��o de interfaces. Definindo assim como os objetos interagir�o
		 * uns com os outros, dessa forma depois s� � necessario criar os objtos
		 * que ir�o implementar essas interfaces.   */
		
		
		
	}
	
	

}
