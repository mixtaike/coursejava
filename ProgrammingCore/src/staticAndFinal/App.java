package staticAndFinal;

class Thing{
	
	/*Convencionalmente em Java constantes s�o escritas com LETRAS MAIUSCULAS */
	/*Criando uma variavel estatica(que s� pode ser acessada pelo nome da propria classe)
	 * Constante - final -  que n�o pode ser modificada ao decorrer da execu��o do programa
	 * */
	public final static int LUCKY_NUMBER = 7;
	
	
	/*Variaveis estaticas s�o boas para contar quando objetos foram instanciados a partir da classe*/
	
	public static int count = 0;
	public final int id;
	
	/*Assim que um novo objeto for instanciado o count ser� incrementado e a variavel id receber� count*/
	/*Count sendo estatico pertencer� a classe e n�o aos objetos.*/
	Thing() {
		id = count;
		count++;
	}
	
	
	
	
	/*variaveis de instancia, onde cada objeto instancia recebe uma copia da variavel.*/
	public String name;
	
	/*variavel estatica dentro de uma classe � uma atributo que pertence a propria classe(� associado a propria classse),
	 * que quando gerando um nova instancia de objeto da classe esse atributo n�o pode ser utilizado
	 * pelos objetos, pois � estatica e pertence somente a classe. Para utilizar esse metodo �
	 * necessario que no main seja chamado pelo nome da classe o metodo:
	 * Thing.description */
	public static String description;
	
	
	/*metodos estaticos X metodos de instancia*/
	/*metodos ou variaveis estaticas s� podem ser chamadas diretamente pela classe, pois
	 * o metodo ou variavel pertence exclusivamente a ela e n�o a seus obejtos.*/
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println("hello");
	}
	
	/*Metodos estaticos podem chamar outros metodos estaticos e variaveis estaticos, podem n�o
	 * podem chamar metodos de instancia e variaveis de instancia.*/
	
	public static void showInfo2() {
		System.out.println(description);
		//Won't work: System.out.println(name);
	}
	
	/*Metodos de instancia podem chamar metodos estaticos.*/
	
	public void showName2() {
		System.out.println("Object id: "+id+" "+description + " "+name);
	}
	
	/*Onde s�o utilizados metodos estaticos?
	 *S�o utilizados por exemplo: Math. class */
}

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Before creating objects, count is: "+Thing.count);
		
		Thing thing1 = new Thing();
		System.out.println("After creating objects, count is: "+Thing.count);
		Thing thing2 = new Thing();
		System.out.println("After creating objects, count is: "+Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		Thing.description = "I'm a thing!";
		System.out.println(Thing.description);
		
		
		/*Chamado um metodo de instancia*/
		thing1.showName();
		thing2.showName();
		
		thing1.showName2();
		thing2.showName2();
		
		/*Chamando um metodo estatico*/
		Thing.showInfo();
		
		/*Chamando uma variavel estatica constante da propria classe MATH*/
		System.out.println(Math.PI);
		
		/*Chamando uma variavel estatica constante da propria classe Thing*/
		System.out.println(Thing.LUCKY_NUMBER);
		
		
	}

	
}
