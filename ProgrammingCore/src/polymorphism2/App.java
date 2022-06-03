package polymorphism2;

public class App {

	public static void main(String[] args) {
		/*Em Java polimorfismo � trabalhar com metodos que tem diferentes formas.
		 * Por exemplo: tenho a classe funcionario:
		 * Na classe funcionario tenho um metodo pagamento, cada tipo de fucnionario
		 * recebe um valor de pagamento diferente. Eu crio mais duas classes, uma 
		 * chamada atendente e outra chamada gerente, essas classes ir�o extender da 
		 * classe funcionario. Implemento dentro das novas classes criados um valor
		 * da pagamento pros dois tipos de funcionarios. Ao instanciar um novo funcionario
		 * no poliformismo ficaria dessa forma:
		 * Funcionario funcionario1 = new Atendente()
		 * Funcionario funcionario2 = new Gerente()
		 * Todo atendente � um funcionario e todo gerente � funcionario. Sendo assim o tipo
		 * de objeto a ser instanciado � um funcionario. Por�m esse objeto recebe o tipo que 
		 * ele vai ser no caso, gerente se for um funcionario desse tipo ou atendente se for
		 * um funcionario desse tipo.
		 * Se eu chamar o funcionario1 ser� impresso um salario referente ao cargo "atendente'.
		 * Se eu chamar o funcionario2 ser� impresso um salario referente ao cargo "gerente"
		 * Isso � polimorfismo, � dar varias formas h� um metodo. Eles compartilham os mesmo
		 * metodos que possuem na classe m�e.
		 * 
		 */
		
		Funcionario funcionario1 = new Atendente();
		Funcionario funcionario2 = new Gerente();
		
		funcionario1.salario();
		funcionario2.salario();
		
		funcionario1.horasPorDia();
		funcionario2.horasPorDia();

	}

}
